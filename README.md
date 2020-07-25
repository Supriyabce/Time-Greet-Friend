# TimeGreetFriend
Greeting According to time of day (Android)
here is the logic of greeting
if(hour>= 12 && hour < 17){
    greeting = "Good Afternoon";
} else if(hour >= 17 && hour < 21){
    greeting = "Good Evening";
} else if(hour >= 21 && hour < 24){
    greeting = "Good Night";
} else {
    greeting = "Good Morning";
}
