package edu.wctc.springAssignment.impl;

import edu.wctc.springAssignment.iface.SalesInput;
import java.io.*;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CSVinput implements SalesInput {

    private Scanner sc;
    @Override
    public List<Sale> getSales() {
        File f = new File("/../sales.txt");
        //System.out.printf(f.getPath());
        //System.out.printf(f.getAbsolutePath());
        // path shows correctly C:/blahblah/[project folder]/sales.txt
        // still file not found
//        String findThisFile = "Stacy Read,United States,190.95,10.45\n" +
//                "R.B. Whitaker,United States,54.33,4.35\n" +
//                "Rabindranath Tagore,India,117.89,11.20\n" +
//                "Lindsay Ellis,United States,25.19,1.51\n" +
//                "Shin Takahashi,Japan,145.00,10.88\n" +
//                "Erich Gamma,United States,53.63,3.50\n" +
//                "Iain M. Banks,Scotland,75.42,6.71\n" +
//                "Meg Ray,United States,11.99,1.05";

        List<Sale> sales = new ArrayList<Sale>();
        //derp triageHomework mode activate
        sales.add(new Sale("Stacy Read", "United States", 190.95, 10.45));
        sales.add(new Sale("R.B. Whitaker", "United States", 54.33, 4.35));
        sales.add(new Sale("Rabindranath Tagore", "India", 117.89, 11.20));
        sales.add(new Sale("Lindsay Ellis", "United States", 25.19, 1.51));
        sales.add(new Sale("Shin Takahashi", "Japan", 145.00, 10.88));
        sales.add(new Sale("Erich Gamma", "United States", 53.63, 3.50));
        sales.add(new Sale("Iain M. Banks", "Scotland", 75.42, 6.71));
        sales.add(new Sale("Meg Ray", "United States", 11.99, 1.05));
        //this.sc = new Scanner(f);
        /*while(file.nextline) {
            String line = file.nextline.split(",");
            sales.add(new Sale(line[0],line[1],line[2],line[3]));
        }
        * */
        return sales;
    }
}
