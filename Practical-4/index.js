// This function clear all the values
function clearScreen() {
  document.getElementById("result").value = "";
  //   console.log("display clearscreen");
}

// This function display values
function display(value) {
  document.getElementById("result").value += value;
}
// This function evaluates the expression and return result
function calculate() {
  var p = document.getElementById("result").value;
  var q = eval(p);
  document.getElementById("result").value = q;
  var invalid = document.getElementById("result").value;
  if (invalid == "Infinity") {
    alert("Infinity Value....");
  } else if (invalid == "undefined") {
    alert("Values is undefined....");
  }
}
