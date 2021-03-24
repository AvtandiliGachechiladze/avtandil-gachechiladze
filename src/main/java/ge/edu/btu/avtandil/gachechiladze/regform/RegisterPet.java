package ge.edu.btu.avtandil.gachechiladze.regform;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerpet")
public class RegisterPet extends HttpServlet {
    public static final String VIEW = "/showPet.jsp";
    Pet pet = new Pet();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pet", pet);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String petSakheli = req.getParameter("sakheli");
        String petJishi = req.getParameter("jishi");
        String  petSqesi = req.getParameter("sqesi");
        int petAsaki = Integer.parseInt(req.getParameter("asaki"));

        pet.SetPetOptions(petSakheli,petJishi,petSqesi,petAsaki);
        System.out.println(pet.ViewPetInfo());
        doGet(req,resp);
    }
}
