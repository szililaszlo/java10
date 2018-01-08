package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class SacramentoUtil {
    private ArrayList<Crime> crimes;

    public SacramentoUtil() {
        this.crimes = new ArrayList<>();
    }

    public  void readSacramentoCSV() {
        //TODO beolvasni soronként
        // majd hozzáadni ehhez a listához a crime példányt


        try {
            // fájl hely megadás
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\Helix3\\Downloads\\SacramentocrimeJanuary2006.txt"));

            // azelső sorok beolvaása string típusba
            String line1 = reader1.readLine();

            // i változó az oszlopcímek elkerüléséhez
            int i= 0;
            // beolvaásá amíg a következő sor nem null, azaz nem ér el a végére
            while (line1 != null) {
            if(i > 0) {

                String[] array = new String[9];
                array = line1.split(",");
                Crime crime = new Crime();
                crime.setcDateTime(array[0]);
                crime.setAddress(array[1]);
                crime.setDistrict(Integer.parseInt(array[2]));
                crime.setBeat(array[3]);
                crime.setGrid(Integer.parseInt(array[4]));
                crime.setCrimeDescr(array[5]);
                crime.setUcrNcicCode(Integer.parseInt(array[6]));
                crime.setLatitude(Float.parseFloat(array[7]));
                crime.setLongtitude(Float.parseFloat(array[8]));

                crimes.add(crime);
            }
            i++;

                //következő sorok beolvasása
                line1 = reader1.readLine();
            }
            System.out.println(crimes.size());

            // kapcsolatok bezárása
            reader1.close();
        }

        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}
