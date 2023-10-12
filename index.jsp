<!DOCTYPE html>
<html>
<head>
    <title>Java Web Application</title>
</head>
<body>
    <h1>Shuffle an Array</h1>
    <form action="MyServlet" method="get">
        <input type="hidden" name="action" value="shuffleArray">
        <input type="submit" value="Shuffle Array">
    </form>
    <c:if test="${shuffledArray ne null}">
        <p>Shuffled Array: ${shuffledArray}</p>
    </c:if>

    <h1>Roman Number to Integer</h1>
    <form action="MyServlet" method="get">
        <input type="hidden" name="action" value="romanToInteger">
        Roman Numeral: <input type="text" name="romanNumeral">
        <input type="submit" value="Convert to Integer">
    </form>
    <c:if test="${romanToIntegerResult ne null}">
        <p>Integer Value: ${romanToIntegerResult}</p>
    </c:if>

    <h1>Check for Pangram</h1>
    <form action="MyServlet" method="get">
        <input type="hidden" name="action" value="checkPangram">
        Input Sentence: <input type="text" name="inputSentence">
        <input type="submit" value="Check for Pangram">
    </form>
    <c:if test="${isPangramResult ne null}">
        <p>Is Pangram: ${isPangramResult}</p>
    </c:if>
</body>
</html>
