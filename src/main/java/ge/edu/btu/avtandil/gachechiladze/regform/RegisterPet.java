package ge.edu.btu.avtandil.gachechiladze.regform;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerpet")
public class RegisterPet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String petSakheli = req.getParameter("sakheli");
        String petJishi = req.getParameter("jishi");
        String  petSqesi = req.getParameter("sqesi");
        int petAsaki = Integer.parseInt(req.getParameter("asaki"));

        Pet pet = new Pet(petSakheli,petJishi,petSqesi,petAsaki);
        pet.PrintPetInfo();
    }
}
