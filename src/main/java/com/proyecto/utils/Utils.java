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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Gema
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

    public String generarClaveElector(ClaveElector customer) {
        String claveElector = "";

        claveElector += getConsonantes(customer.getApellidoPaterno());
        claveElector += getConsonantes(customer.getApellidoMaterno());
        claveElector += getConsonantes(customer.getNombre());
        claveElector += String.valueOf(customer.getAnioNacimiento());
        claveElector += String.valueOf(customer.getMesNacimiento());
        claveElector += String.valueOf(customer.getDiaNacimiento());
        claveElector += customer.getEntidadFederativa();
        claveElector += customer.getSexo();
        claveElector += generateRandomNumbers(3);

        return claveElector;
    }

    public String[] dividirFecha(String fecha) {
        String[] partes = fecha.split("/");
        String[] resultado = new String[3];

        resultado[0] = String.format("%02d", Integer.parseInt(partes[0]));
        resultado[1] = String.format("%02d", Integer.parseInt(partes[1]));
        resultado[2] = partes[2].substring(2); // Obtener los últimos dos caracteres del año

        return resultado;

    }

    public static String getConsonantes(String palabra) {
        int contadorConsonantes = 0;
        char primeraConsonante = ' ';
        char segundaConsonante = ' ';
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isLetter(letra) && !esVocal(letra)) {
                contadorConsonantes++;
                if (contadorConsonantes == 1) {
                    primeraConsonante = letra;
                } else if (contadorConsonantes == 2) {
                    segundaConsonante = letra;
                    break;
                }
            }
        }
        return "" + primeraConsonante + segundaConsonante;
    }

    private static boolean esVocal(char letra) {
        return "AEIOUaeiou".indexOf(letra) != -1;
    }

    public String obtenerClaveEntidadFederativa(String entidadFederativa) {
        String claveEntidadFederativa = "";
        switch (entidadFederativa.toUpperCase()) {
            case "AGUASCALIENTES":
                claveEntidadFederativa = "01";
                break;
            case "BAJA CALIFORNIA":
                claveEntidadFederativa = "02";
                break;
            case "BAJA CALIFORNIA SUR":
                claveEntidadFederativa = "03";
                break;
            case "CAMPECHE":
                claveEntidadFederativa = "04";
                break;
            case "COAHUILA":
                claveEntidadFederativa = "05";
                break;
            case "COLIMA":
                claveEntidadFederativa = "06";
                break;
            case "CHIAPAS":
                claveEntidadFederativa = "07";
                break;
            case "CHIHUAHUA":
                claveEntidadFederativa = "08";
                break;
            case "CIUDAD DE MEXICO":
                claveEntidadFederativa = "09";
                break;
            case "DURANGO":
                claveEntidadFederativa = "10";
                break;
            case "GUANAJUATO":
                claveEntidadFederativa = "11";
                break;
            case "GUERRERO":
                claveEntidadFederativa = "12";
                break;
            case "HIDALGO":
                claveEntidadFederativa = "13";
                break;
            case "JALISCO":
                claveEntidadFederativa = "14";
                break;
            case "MEXICO":
                claveEntidadFederativa = "15";
                break;
            case "MICHOACAN":
                claveEntidadFederativa = "16";
                break;
            case "MORELOS":
                claveEntidadFederativa = "17";
                break;
            case "NAYARIT":
                claveEntidadFederativa = "18";
                break;
            case "NUEVO LEON":
                claveEntidadFederativa = "19";
                break;
            case "OAXACA":
                claveEntidadFederativa = "20";
                break;
            case "PUEBLA":
                claveEntidadFederativa = "21";
                break;
            case "QUERETARO":
                claveEntidadFederativa = "22";
                break;
            case "QUINTANA ROO":
                claveEntidadFederativa = "23";
                break;
            case "SAN LUIS POTOSI":
                claveEntidadFederativa = "24";
                break;
            case "SINALOA":
                claveEntidadFederativa = "25";
                break;
            case "SONORA":
                claveEntidadFederativa = "26";
                break;
            case "TABASCO":
                claveEntidadFederativa = "27";
                break;
            case "TAMAULIPAS":
                claveEntidadFederativa = "28";
                break;
            case "TLAXCALA":
                claveEntidadFederativa = "29";
                break;
            case "VERACRUZ":
                claveEntidadFederativa = "30";
                break;
            case "YUCATAN":
                claveEntidadFederativa = "31";
                break;
            case "ZACATECAS":
                claveEntidadFederativa = "32";
                break;
            default:
                break;
        }
        return claveEntidadFederativa;
    }

    private static String obtenerDigitoVerificador(String claveElector) {
        int suma = 0;
        for (int i = 0; i < claveElector.length(); i++) {
            char c = claveElector.charAt(i);
            if (Character.isLetter(c)) {
                suma += (int) c - 55;
            } else {
                suma += Character.getNumericValue(c);
            }
        }
        int digitoVerificador = suma % 10;
        return String.valueOf(digitoVerificador);
    }

}
