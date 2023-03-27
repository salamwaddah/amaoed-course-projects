# Prepared by: Abdulsalam Alaraj
# For: AMA Computer University
# Course project: Programming Language with Compiler

# Create a Basic Python Program with the following requirements.
# Contact Tracing Form Program
# 1.	Prompt to Enter your name
# 2.	Prompt to Enter your temperature
# 3.	Set of Questionnaires containing symptoms of COVID19 at least 5.
# 4.	Use modular codes.
# 5.	Use conditional codes for each question. (YES or NO)
# 6.	For the string outputs after answering all the questions:
#   a.	Display the name entered and the temperature
#   b.	“You may be infected with COVID19!” – if one of the symptoms of COVID19 were answered yes.
#   c.	“You have no symptoms of COVID19!” – if all the symptoms of COVID19 were answered no.
#   d.	“Please review your answer! Start over again” – If a question was not answered correctly (terminate the program).

# Ask a yes or no question and return the answer as a boolean value
def ask_yes_no_question(question_text):
    while True:
        answer = input(question_text + " (yes/no): ").lower()

        if answer == "yes":
            return True
        elif answer == "no":
            return False
        else:
            raise ValueError


# Print out the user's name, temperature and the results of their test
def print_result(name, temp, has_symptoms):
    print("============================")
    print("- Name: " + name)
    print("- Temperature: " + str(temp))

    if has_symptoms:
        print("- Result: You may be infected with COVID19!")
    else:
        print("- Result: You have no symptoms of COVID19!")


# Prompt user for name
name = input("Enter your name: ")

# Prompt user for temperature, only accept numeric values
while True:
    try:
        temperature = float(input("Enter your temperature: "))
        break
    except ValueError:
        print("Please enter a valid temperature.")

# List of symptoms
symptoms = [
    ("fever", "Do you have a fever?"),
    ("cough", "Do you have a cough?"),
    ("breath-shortness", "Do you have shortness of breath?"),
    ("taste-smell-loss", "Have you lost your sense of taste or smell?"),
    ("sore-throat", "Do you have a sore throat?")
]

# Ask symptom questions and store the answers in a dictionary
symptom_answers = {}

try:
    for symptom, question in symptoms:
        has_symptom = ask_yes_no_question(question)
        symptom_answers[symptom] = has_symptom

    # Print out the test results
    print_result(name, temperature, any(symptom_answers.values()))
except ValueError:
    print("Please review your answer! Start over again")
