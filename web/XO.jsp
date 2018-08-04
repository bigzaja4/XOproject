<%-- 
    Document   : XO
    Created on : Aug 3, 2018, 2:39:49 PM
    Author     : bigza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!doctype html>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8">
        <title>Tic Tac Toe</title>
        <link rel="stylesheet" href="game.css" type="text/css" media="screen" charset="utf-8">
    </head>

    <body>
        <div class="center">
            <h1>Tic-Tac-Toe</h1>
            <table id="board">
                <tr>
                    <td id="R1_C1"><div class="mark"></div></td>
                    <td id="R1_C2" ></td>
                    <td id="R1_C3"></td>
                </tr>
                <tr>
                    <td id="R2_C1"></td>
                    <td id="R2_C2"></td>
                    <td id="R2_C3"></td>
                </tr>
                <tr>
                    <td id="R3_C1"></td>
                    <td id="R3_C2"></td>
                    <td id="R3_C3"></td>
                </tr>
            </table>



            <div class="white-font">
                <!--                <form>-->
                <div class="divF">
                    <h2>Player 1 (X)</h2>
                    <label id="player1Score">${player1Score}</label>
                </div>

                <div class="divF">
                    <h2>Tie</h2>
                    <label id="tieScore">${tieScore}</label>
                </div>

                <div class="divF">
                    <h2>Player 2 (O)</h2>
                    <label id="player2Score">${player2Score}</label>
                </div>
            </div>
        </div>

    </body>
</html>