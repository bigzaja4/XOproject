*** Settings ***
Library    SeleniumLibrary


*** Variables ***
${URL}    http://localhost:8412/webapp/xo.jsp
${BROWSER}    chrome

*** Test Cases ***
ให้ player 1 ชนะในแนวนอนที่ column3
    เปิดหน้าเว็บ
    เพลเยอร์1วางที่R1_C3
    เพลเยอร์2วางที่R2_C2
    เพลเยอร์1วางที่R2_C3
    เพลเยอร์2วางที่R3_C1
    เพลเยอร์1วางที่R3_C3
    แสดงผลว่า player1 มี 1 score
    ปิดหน้าเว็บ
    
*** Keywords ***
เปิดหน้าเว็บ
    Open Browser    ${URL}    ${BROWSER}


เพลเยอร์1วางที่R1_C3
    Click Element    id=R1_C3
    Wait Until Element Contains    id=R1_C3    O

เพลเยอร์2วางที่R2_C2
    Click Element    id=R2_C2
    Wait Until Element Contains    id=R2_C2    X

เพลเยอร์1วางที่R2_C3
    Click Element    id=R2_C3
    Wait Until Element Contains    id=R2_C3    O

เพลเยอร์2วางที่R3_C1
    Click Element    id=R3_C1
    Wait Until Element Contains    id=R3_C1    X

เพลเยอร์1วางที่R3_C3
    Click Element    id=R3_C3
    Wait Until Element Contains    id=R3_C3    O

แสดงผลว่า player1 มี 1 score
    Wait Until Element Contains    id=player1Score    1

ปิดหน้าเว็บ
    Close Browser    ${URL}    ${BROWSER}