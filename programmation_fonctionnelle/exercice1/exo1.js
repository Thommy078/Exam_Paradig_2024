function calculateTip(totalAmount, serviceRating) {
    const tipPourcentages = {
        "terrible": 0,
        "poor": 0.05,
        "good": 0.10,
        "great": 0.15,
        "excellent": 0.20
    };

    serviceRating = serviceRating.toLowerCase();

    if (tipPourcentages.hasOwnProperty(serviceRating)) {
        return Math.ceil(totalAmount * tipPourcentages[serviceRating]);
    } else {
        return "Rating not recognised";
    }
}
console.log(calculateTip(20, "ExcellEnt"));
console.log(calculateTip(26.95, "goOd")); 
console.log(calculateTip(20, "hi")); 