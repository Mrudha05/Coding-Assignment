function appendToDisplay(value) {
    document.getElementById("display").value += value;
}

function clearDisplay() {
    document.getElementById("display").value = "";
}

function calculateResult() {
    try {
        var expression = document.getElementById("display").value;
        var result = eval(expression);

        if (result === Infinity || result === -Infinity) {
            document.getElementById("display").value = "Error";
        } else {
            document.getElementById("display").value = result;
        }
    } catch (error) {
        document.getElementById("display").value = "Error";
    }
}
