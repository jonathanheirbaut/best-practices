package com.realdolmen.party.servlets;

import com.google.gson.Gson;
import com.realdolmen.party.services.PartyService;
import com.realdolmen.party.services.PartyServiceImpl;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by JHRAU70 on 18/09/2014.
 */
@WebServlet(name = "JsonServlet", urlPatterns = {"/Json"})
public class JsonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Inject
    PartyService partyService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson = new Gson();
        PrintWriter writer = response.getWriter();
        writer.print(gson.toJson(partyService.getParties()));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
