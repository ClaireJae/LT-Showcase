# LT-Showcase

Hello! I am Claire Jaeger and this is my LeanTechniques Showcase.

I decided to use Java for this project. So to start off, I created a list of the bill and coin amounts which I then later use in the currencyAmt method. I then wanted to validate that the user must input a number that isn't negative, so I wrote an if statement for that. After the invalid message, I call the method that turns the user's currency amount into the seperate bill and coins amounts. It is basically the same for both bill & coin statements. The bill_amt in the bill list is divided by the user_amt to return the specific numbers on how many bills of each there are. The amount is then subtracted from the total to get the coin amount. That is where I unfortunately could not figure out how to get the penny amounts perfect. It works great if the user's amount is below double digits, but if I enter $19.99, the penny amount is one off. I then used an if-else statement to translate the coin amount to the type of coin. I did this for the bills too at first, but then saw that it was unnecessary. I also made the output look like the example shown in the PDF. Thank you for your time!
