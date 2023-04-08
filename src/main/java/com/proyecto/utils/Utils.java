/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.proyecto.models.ClaveElector;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author dylan
 */
public class Utils {

    public void ShowPanel(JPanel childrenPanel, JPanel parentPanel, int witdh, int height) {
        childrenPanel.setSize(witdh, height);
        childrenPanel.setLocation(0, 0);

        parentPanel.removeAll();
        parentPanel.add(childrenPanel, BorderLayout.CENTER);
        parentPanel.revalidate();
        parentPanel.repaint();
    }

    public BufferedImage GenerateQR(String texto, int size) {
        Map<EncodeHintType, Object> hintMap = new HashMap<>();
        hintMap.put(EncodeHintType.CHARACTER_SET, StandardCharsets.UTF_8.name());

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix;
        try {
            bitMatrix = qrCodeWriter.encode(texto, BarcodeFormat.QR_CODE, size, size, hintMap);
        } catch (WriterException e) {
            return null;
        }
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
        return qrImage;
    }

    public Color bgCard(String typeOfMembership) {

        switch (typeOfMembership.toUpperCase()) {
            case "PLUS":
                return new Color(186, 158, 74);
            case "PREMIUM":
                return new Color(7, 23, 38);
            default:
                return new Color(18, 105, 174);
        }
    }

    public List<String> getPrivilegios(String membresia) {

        String premium[] = {"Asiento en palco", "Liguilla completa", "Alimento y Bebidas", "Acceso a foto oficial", "Acceso a Videollamada exclusivas", "Foro de opinión",
            "Visitas a entrenamientos", "Firma de autografos", "Descuentos en tiendas oficiales", "Concursos promocionales"};

        String plus[] = {"Alimentos y bebidas", "Visitas a entrenamientos", "Firma de autografos", "Descuento en tiendas oficiales", "Concursos promocionales"};

        String basica[] = {"Visitas a entrenamientos", "Firmas de autografos"};

        List<String> privilegios;

        switch (membresia.toUpperCase()) {
            case "PREMIUM":
                privilegios = Arrays.asList(premium);
                break;
            case "PLUS":
                privilegios = Arrays.asList(plus);
                break;
            default:
                privilegios = Arrays.asList(basica);
                break;
        }

        return privilegios;
    }

    public String formatoMoneda(int monto) {
        DecimalFormat f = new DecimalFormat("$#,###.00");
        String moneda = f.format(monto);
        System.out.println(moneda);
        return moneda;
    }

    /**
     *
     * @param day
     * @return Retorna el mes siguiente con el día.
     */
    public String getNextMonth(String day) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();

        month++;

        switch (month) {
            case 1:
                return day + " / Ene";
            case 2:
                return day + " / Feb";
            case 3:
                return day + " / Mar";
            case 4:
                return day + " / Abr";
            case 5:
                return day + " / May";
            case 6:
                return day + " / Jun";
            case 7:
                return day + " / Jul";
            case 8:
                return day + " / Ago";
            case 9:
                return day + " / Sep";
            case 10:
                return day + " / Oct";
            case 11:
                return day + " / Nov";
            default:
                return day + " / Dic";
        }
    }

    public String getCredit(String salario) {
        switch (salario) {
            case "$1 - $4,000":
                return "5000";
            case "$4,001 - $8,000":
                return "10000";
            case "$8,001 - $16,000":
                return "15000";
            default:
                return "20000";
        }
    }

    public String generateRandomNumbers(int cantidad) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String capitalizeFirstLetter(String text) {
        StringBuilder sb = new StringBuilder();
        String[] palabras = text.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                char primeraLetra = Character.toUpperCase(palabra.charAt(0)); // Convierte la primera letra a mayúscula
                sb.append(primeraLetra).append(palabra.substring(1)).append(" "); // Agrega la palabra al StringBuilder con la primera letra en mayúscula
            }
        }
        return sb.toString().trim(); // Devuelve el contenido del StringBuilder como un String, sin espacios en blanco al final
    }

    public String generateRandomString(int longitud) {
        StringBuilder sb = new StringBuilder(longitud);
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            sb.append(caracterAleatorio);
        }
        return sb.toString();
    }

    public String getExtension(File archivo) {
        String nombreArchivo = archivo.getName();
        int indiceUltimoPunto = nombreArchivo.lastIndexOf(".");
        if (indiceUltimoPunto == -1) {
            return ""; // Si no se encuentra un punto en el nombre del archivo, devuelve una cadena vacía
        } else {
            return nombreArchivo.substring(indiceUltimoPunto + 1); // Devuelve la subcadena que va después del último punto
        }
    }

    public boolean verifyFile(String extension) {

        switch (extension.toLowerCase()) {
            case "png":
            case "jpg":
            case "jpeg":
                return true;
            default:
                return false;
        }

    }

    public String generarClaveElector(ClaveElector claveElector) {
        String nombre = claveElector.getNombre().toUpperCase();
        String apellidoPaterno = claveElector.getApellidoPaterno().toUpperCase();
        String apellidoMaterno = claveElector.getApellidoMaterno() != null
                ? claveElector.getApellidoMaterno().toUpperCase() : "";
        String fechaNacimiento = claveElector.getFechaNacimiento().replaceAll("/", "");
        String sexo = claveElector.getSexo().toUpperCase();
        String nacionalidad = claveElector.getNacionalidad().toUpperCase();
        String estadoNacimiento = claveElector.getEstadoNacimiento().toUpperCase();

        StringBuilder sb = new StringBuilder();

        sb.append(apellidoPaterno.charAt(0));
        for (int i = 1; i < apellidoPaterno.length(); i++) {
            if (Character.isLetter(apellidoPaterno.charAt(i))) {
                sb.append(apellidoPaterno.charAt(i));
                break;
            }
        }

        sb.append(apellidoMaterno.charAt(0));
        sb.append(nombre.charAt(0));
        sb.append(fechaNacimiento.substring(2));
        sb.append(fechaNacimiento.charAt(0));
        sb.append(fechaNacimiento.charAt(1));
        sb.append(fechaNacimiento.substring(4));
        sb.append(sexo.charAt(0));
        sb.append(nacionalidad.charAt(0));
        sb.append(estadoNacimiento.charAt(0));

        String clave = sb.toString();

        int homoclave = (int) (Math.random() * 10000);
        DecimalFormat formatter = new DecimalFormat("0000");
        String homoclaveStr = formatter.format(homoclave);

        return clave + homoclaveStr;
    }

}
