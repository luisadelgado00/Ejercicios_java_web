import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
@WebServlet(urlPatterns = {"/Servidor"})

public class Servidor extends HttpServlet {
    ArrayList<Pais> Paises = new ArrayList<Pais>();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servidor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<input type=\"submit\" value=\"Funciones\">");
            out.println("<h1>Servlet Servidor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");             
        PrintWriter out = response.getWriter(); 
        
        out.println("<html>");             
        out.println("<body>");  
        Pais nigeria = new Pais();
        nigeria.setCapital("Abuya");
        nigeria.setGentilicio("Nigeriano");
        nigeria.setIdioma("Ingles");
        nigeria.setMoneda("Naira");
        Pais egipto = new Pais();
        egipto.setCapital("El Cairo");
        egipto.setGentilicio("Egipcio");
        egipto.setIdioma("Arabe");
        egipto.setMoneda("Libra egipcia");
        Pais ghana = new Pais("Ghanes", "Cedi", "Ingles", "Acra");
        Pais uganda = new Pais("Ugandes", "Chelin Ugandes", "Suajili", "Kampala");
        Pais kenia = new Pais("Keniano", "Chelin Keniano", "Suajili", "Nairobi");
        
        Paises.add(nigeria); //Nigeria
        Paises.add(egipto);
        Paises.add(ghana);
        Paises.add(uganda);
        Paises.add(kenia);
   
       
        String pais=request.getParameter("pais");
        String moneda =request.getParameter("cantidad");
        double mn,megipto,mnigeria,mghana,mkenia,muganda;
        mn =Double.parseDouble(moneda);
        if ("Nigeria".equals(pais)|"nigeria".equals(pais)) {
            out.println(nigeria.toString()+"<br>");
            out.println("<br>"+"Listado palabras basicas traducidas:");
            String palabran="\n"+"1. Hola = Hello"+"\n"+"2. Gracias = Thanks"+"\n"+"3. Nombre = Name"+
                        "\n"+"4. Si = Yes"+"\n"+"5. Adios = Bye"+"\n"+"6. Ir = Go"+"\n"+"7. Disculpe = Excuse me"+
                        "\n"+"8. No = No"+"\n" + "9. Policia = Police"+"\n" +"10. Hospital = Hospital"+"\n";
            
            out.println("<br>"+"1. Hola = Hello"+"<br>"+"2. Gracias = Thanks"+"<br>"+"3. Nombre = Name"+
                        "<br>"+"4. Si = Yes"+"<br>"+"5. Adios = Bye"+"<br>"+"6. Ir = Go"+"<br>"+"7. Disculpe = Excuse me"+
                        "<br>"+"8. No = No"+"<br>" + "9. Policia = Police"+"<br>" +"10. Hospital = Hospital"+"<br>");
        mnigeria=mn*0.10930;
        out.println("<br>"+"Cantidad en nairas: "+mnigeria);
        
        String ruta = "C:\\Users\\luisa\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Gentilicio: "+nigeria.getGentilicio()+"\nMoneda: "+nigeria.getMoneda()+"\nIdioma: "+nigeria.getIdioma()+"\nCapital: "+nigeria.getCapital()+"\n"+palabran+"Conversion: "+mnigeria);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
        
    }    
        if ("Egipto".equals(pais)| "egipto".equals(pais)) {
           out.println(egipto.toString()+"<br>");
           out.println("<br>"+"Listado palabras basicas traducidas:");
           String palabrae="\n"+"\n"+"1. Hola = Marhabaan"+"\n"+"2. Gracias = Shukraan"+"\n"+"3. Nombre = Aism"+
                       "\n"+"4. Si = 'iidha"+"\n" +"5. Adios = Wadaeaan"+"\n"+"6. Ir = Adhhab"+"\n"+"7. Disculpe = 'ismah li"+
                       "\n"+"8. No = La"+"\n" + "9. Policia = Shurta"+"\n"+"10. Hospital = Mustashfaa"+"\n";
           
        out.println("<br>"+"<br>"+"1. Hola = Marhabaan"+"<br>"+"2. Gracias = Shukraan"+"<br>"+"3. Nombre = Aism"+
                       "<br>"+"4. Si = 'iidha"+"<br>" +"5. Adios = Wadaeaan"+"<br>"+"6. Ir = Adhhab"+"<br>"+"7. Disculpe = 'ismah li"+
                       "<br>"+"8. No = La"+"<br>" + "9. Policia = Shurta"+"<br>"+"10. Hospital = Mustashfaa"+"<br>");
        megipto=mn*0.0048600;
        out.println("<br>"+"Cantidad en libras egipcias: "+megipto);
        
        String ruta = "C:\\Users\\luisa\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Gentilicio: "+egipto.getGentilicio()+"\nMoneda: "+egipto.getMoneda()+"\nIdioma: "+egipto.getIdioma()+"\nCapital: "+egipto.getCapital()+"\n"+palabrae+"Conversion: "+megipto);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }     
     if ("Ghana".equals(pais)|"ghana".equals(pais)) {
            out.println(ghana.toString()+"<br>");
            out.println("<br>"+"Listado palabras basicas traducidas:");
            String palabrag="\n"+"1. Hola = Hello"+"\n"+"2. Gracias = Thanks"+"\n"+"3. Nombre = Name"+
                        "\n"+"4. Si = Yes"+"\n"+"5. Adios = Bye"+"\n"+"6. Ir = Go"+"\n"+"7. Disculpe = Excuse me"+
                        "\n"+"8. No = No"+ "\n" +"9. Policia = Police"+"\n" +"10. Hospital = Hospital"+"\n";
            
            out.println("<br>"+"1. Hola = Hello"+"<br>"+"2. Gracias = Thanks"+"<br>"+"3. Nombre = Name"+
                        "<br>"+"4. Si = Yes"+"<br>"+"5. Adios = Bye"+"<br>"+"6. Ir = Go"+"<br>"+"7. Disculpe = Excuse me"+
                        "<br>"+"8. No = No"+ "<br>" +"9. Policia = Police"+"<br>" +"10. Hospital = Hospital"+"<br>" );
            mghana=mn*0.0016500;
            out.println("<br>"+"Cantidad en cedis: "+mghana);
            
        String ruta = "C:\\Users\\luisa\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Gentilicio: "+ghana.getGentilicio()+"\nMoneda: "+ghana.getMoneda()+"\nIdioma: "+ghana.getIdioma()+"\nCapital: "+ghana.getCapital()+"\n"+palabrag+"Conversion: "+mghana);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }
    if ("Uganda".equals(pais)|"uganda".equals(pais)) {
            out.println(uganda.toString()+"<br>");
            out.println("<br>"+"Listado palabras basicas traducidas:");
            String palabrau="\n"+"1. Hola = Hello"+"\n"+"2. Gracias = Asante"+"\n"+"3. Nombre = Jina"+
                        "\n"+"4. Si = Ndio"+"\n"+"5. Adios = Kwaheri"+"\n"+"6. Ir = Nenda"+"\n"+"7. Disculpe = Samahani"+
                        "\n"+"8. No = Hapana"+"\n" + "9. Policia = Polisi"+"\n" +"10. Hospital = Hospitali"+"\n";
            
             out.println("<br>"+"1. Hola = Hello"+"<br>"+"2. Gracias = Asante"+"<br>"+"3. Nombre = Jina"+
                        "<br>"+"4. Si = Ndio"+"<br>"+"5. Adios = Kwaheri"+"<br>"+"6. Ir = Nenda"+"<br>"+"7. Disculpe = Samahani"+
                        "<br>"+"8. No = Hapana"+"<br>" + "9. Policia = Polisi"+"<br>" +"10. Hospital = Hospitali"+"<br>" );
            muganda=mn*1.1206;
            out.println("<br>"+"Cantidad en Chelines Ugandeses: "+muganda);
            
             String ruta = "C:\\Users\\luisa\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Gentilicio: "+uganda.getGentilicio()+"\nMoneda: "+uganda.getMoneda()+"\nIdioma: "+uganda.getIdioma()+"\nCapital: "+uganda.getCapital()+"\n"+palabrau+"Conversion: "+muganda);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
            
    } 
    if ("Kenia".equals(pais)|"kenia".equals(pais)) {
            out.println(kenia.toString()+"<br>");
            out.println("<br>"+"Listado palabras basicas traducidas:");
            String palabrak="\n"+"1. Hola = Hello"+"\n"+"2. Gracias = Asante"+"\n"+"3. Nombre = Jina"+
                        "\n"+"4. Si = Ndio"+"\n"+"5. Adios = Kwaheri"+"\n"+"6. Ir = Nenda"+"\n"+"7. Disculpe = Samahani"+
                        "\n"+"8. No = Hapana"+"\n" + "9. Policia = Polisi"+"\n" +"10. Hospital = Hospitali"+"\n" ;
            
            out.println("<br>"+"1. Hola = Hello"+"<br>"+"2. Gracias = Asante"+"<br>"+"3. Nombre = Jina"+
                        "<br>"+"4. Si = Ndio"+"<br>"+"5. Adios = Kwaheri"+"<br>"+"6. Ir = Nenda"+"<br>"+"7. Disculpe = Samahani"+
                        "<br>"+"8. No = Hapana"+"<br>" + "9. Policia = Polisi"+"<br>" +"10. Hospital = Hospitali"+"<br>" );
            mkenia=mn*0.031130;
            out.println("<br>"+"Cantidad en Chelines Kenianos: "+mkenia);
          
        String ruta = "C:\\Users\\luisa\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Gentilicio: "+kenia.getGentilicio()+"\nMoneda: "+kenia.getMoneda()+"\nIdioma: "+kenia.getIdioma()+"\nCapital: "+kenia.getCapital()+"\n"+palabrak+"Conversion: "+mkenia);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
    }
    
       out.println("</body>");
       out.println("</html>");
       
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

  
    
}
