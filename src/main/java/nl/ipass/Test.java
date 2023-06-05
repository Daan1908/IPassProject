package nl.ipass;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/request")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Hello World!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        String reisNaam = req.getParameter("reisNaam");
        String reisOmschrijving = req.getParameter("reisOmschrijving");
        String beginDatum = req.getParameter("beginDatum");
        String eindDatum = req.getParameter("eindDatum");
        System.out.println("Reisnaam: " + reisNaam);
        System.out.println("Reisomschrijving: " + reisOmschrijving);
        System.out.println("Begin Datum: " + beginDatum);
        System.out.println("Eind Datum: " + eindDatum);
        pw.close();
    }
}

