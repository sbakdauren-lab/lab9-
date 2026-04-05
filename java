// Бет жүктелгенде қалқымалы терезе
window.onload = function() {
    alert("Сәлем! Веб-бет сәтті жүктелді. Зертханалық жұмыс дайын!");
};

// Түймені басқанда мәтін өзгереді
document.getElementById("changeText").addEventListener("click", function() {
    document.getElementById("dynamicText").innerHTML = "Мәтін өзгерді! JavaScript жұмыс істейді 🎉";
});
