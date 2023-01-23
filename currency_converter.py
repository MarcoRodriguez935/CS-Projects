# Currencies include: USD, EUR, MXC, YPY, GBP, CHF, CAD,
# Goal: Allow user to input USD amount and convert to a selected currency.
# Inspired by Tech by Tim: YouTube Video: Learn Python With This ONE Project!


def currencies(dol):
    answer = input("OPTIONS:\n(1) Euros\n(2) Pesos\n(3) Yen\n(4) Pounds\n(5) Franc\n(6) Canadian Dollar")
    if answer == "1":
        conversion = (dol * 0.92)
        print(f"Your new balance is {conversion} euros.")
    elif answer == "2":
        conversion = (dol * 18.87)
        print(f"Your new balance is {conversion} pesos.")
    elif answer == "3":
        conversion = (dol * 129.56)
        print(f"Your new balance is {conversion} yen.")
    elif answer == "4":
        conversion = (dol * 0.81)
        print(f"Your new balance is {conversion} pounds")
    elif answer == "5":
        conversion = (dol * 0.92)
        print(f"Your new balance is {conversion} francs.")
    elif answer == "6":
        conversion = (dol * 1.34)
        print(f"Your new balance is {conversion} Canadian dollars.")
    else:
        print("Invalid Input")


def current_balance():
    while True:
        amount = input("Deposit an amount: $")
        if amount.isdigit():
            amount = int(amount)
            if amount > 0:
                break
            else:
                print("Must be higher than 0")
        else:
            print("Invalid Response. Enter a number")

    return amount


def main():
    wallet = current_balance()
    while True:
        print(f"Your current balance is ${wallet} USD")
        answer = input("Currency Options (c), or Quit Program (q)")
        if answer.lower() == "q":
            print("Program Exited")
            quit()
        elif answer.lower() == "c":
            currencies(wallet)


main()
