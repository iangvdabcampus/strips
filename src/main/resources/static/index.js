"use strict";

const response = await fetch("figuren");
if (response.ok) {
  const figuren = await response.json();
  const ulFiguren = document.getElementById("figuren");
  for (const figuur of figuren) {
    const li = document.createElement("li");
    li.innerText = figuur.naam;
    ulFiguren.appendChild(li);
  }
} else {
  alert("Technische fout.");
}