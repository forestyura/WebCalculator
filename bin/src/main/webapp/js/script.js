function addOperation(operation) {
    var resultField = document.getElementById('resultField');
    var fieldValue = resultField.value;
    resultField.value = fieldValue + operation;
}

function removeLastOperation() {
    var resultField = document.getElementById('resultField');
    var fieldValue = resultField.value;
    resultField.value = fieldValue.substring(0, fieldValue.length - 1)
}

function removeResultField() {
    var resultField = document.getElementById('resultField');
    resultField.value = "";
}

function changeSign() {
    var resultField = document.getElementById('resultField');
    var fieldValue = resultField.value;
    var firstElement = fieldValue.charAt(0);
    if (firstElement == '-'){
        resultField.value = fieldValue.substring(1, fieldValue.length)
    } else {
        resultField.value = '-' + fieldValue;
    }
    
}