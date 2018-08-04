*** Settings ***
Library    SeleniumLibrary


*** Variables ***
${URL}    http://localhost:8080/XOproject/XO.jsp
${BROWSER}    chrome

*** Test Cases ***
ให้ player 1 player 2 เสมอกัน
    เปิดหน้าเว็บ
    เพลเยอร์1วางที่R1_C1
    เพลเยอร์2วางที่R1_C2
    เพลเยอร์1วางที่R1_C3
    เพลเยอร์2วางที่R1_C2
    เพลเยอร์1วางที่R3_C2
    เพลเยอร์2วางที่R2_C3
    เพลเยอร์1วางที่R2_C1
    เพลเยอร์2วางที่R3_C1
    เพลเยอร์1วางที่R3_C3
    แสดงผลว่า tieScore มี 1 score
    ปิดหน้าเว็บ
    
*** Keywords ***
เปิดหน้าเว็บ
    Open Browser    ${URL}    ${BROWSER}

เพลเยอร์1วางที่R1_C1
    Click Element    id=R1_C1
    Wait Until Element Contains    id=R1_C1    X

เพลเยอร์2วางที่R1_C2
    Click Element    id=R1_C2
    Wait Until Element Contains    id=R1_C2    O

เพลเยอร์1วางที่R1_C3
    Click Element    id=R2_C2
    Wait Until Element Contains    id=R2_C2    X

เพลเยอร์2วางที่R1_C2
    Click Element    id=R1_C2
    Wait Until Element Contains    id=R1_C2    O

เพลเยอร์1วางที่R3_C2
    Click Element    id=R3_C2
    Wait Until Element Contains    id=R3_C2    X

เพลเยอร์2วางที่R2_C3
    Click Element    id=R2_C3
    Wait Until Element Contains    id=R2_C3    O

เพลเยอร์1วางที่R2_C1
    Click Element    id=R2_C1
    Wait Until Element Contains    id=R2_C1    X

เพลเยอร์2วางที่R3_C1
    Click Element    id=R3_C1
    Wait Until Element Contains    id=R3_C1    O

เพลเยอร์1วางที่R3_C3
    Click Element    id=R3_C3
    Wait Until Element Contains    id=R3_C3    x

แสดงผลว่า tieScore มี 1 score
    Wait Until Element Contains    id=tieScore    1

ปิดหน้าเว็บ
    Close Browser    ${URL}    ${BROWSER}