# Schedule Organizer: Monday - Sunday
# Goal: Allow the user to add/view events to their calendar

COLLECTION = []


def monday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            monday = "MON: "
            event = input("Enter an event for Monday: ")
            time = input("Enter a time: ")
            monday += event
            monday += time
            COLLECTION.append(monday)
        elif run == "r":
            main()
        else:
            continue


def tuesday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            tuesday = "TUE: "
            event = input("Enter an event for Tuesday: ")
            time = input("Enter a time: ")
            tuesday += event
            tuesday += time
            COLLECTION.append(tuesday)
        elif run == "r":
            main()
        else:
            continue


def wednesday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            wednesday = "WED: "
            event = input("Enter an event for Wednesday: ")
            time = input("Enter a time: ")
            wednesday += event
            wednesday += time
            COLLECTION.append(wednesday)
        elif run == "r":
            main()
        else:
            continue


def thursday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            thursday = "THUR: "
            event = input("Enter an event for Thursday: ")
            time = input("Enter a time: ")
            thursday += event
            thursday += time
            COLLECTION.append(thursday)
        elif run == "r":
            main()
        else:
            continue


def friday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            friday = "FRI: "
            event = input("Enter an event for Friday: ")
            time = input("Enter a time: ")
            friday += event
            friday += time
            COLLECTION.append(friday)
        elif run == "r":
            main()
        else:
            continue


def saturday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            saturday = "SAT: "
            event = input("Enter an event for Saturday: ")
            time = input("Enter a time: ")
            saturday += event
            saturday += time
            COLLECTION.append(saturday)
        elif run == "r":
            main()
        else:
            continue


def sunday():
    while True:
        run = input("Add Events (e) or Return (r): ").lower()
        if run == "e":
            sunday = "SUN: "
            event = input("Enter an event for Sunday: ")
            time = input("Enter a time: ")
            sunday += event
            sunday += time
            COLLECTION.append(sunday)
        elif run == "r":
            main()
        else:
            continue


def main():
    while True:
        choice = input("Would you like to (VIEW/ADD) your events?").lower()
        if choice == "view":
            print(COLLECTION)
        elif choice == "add":
            choice = input("Choose a day:\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday").lower()
            if choice == "monday":
                print(monday())
            elif choice == "tuesday":
                print(tuesday())
            elif choice == "wednesday":
                print(wednesday())
            elif choice == "thursday":
                print(thursday())
            elif choice == "friday":
                print(friday())
            elif choice == "saturday":
                print(saturday())
            elif choice == "sunday":
                print(sunday())
            else:
                print("Invalid Response")
                continue
        else:
            print("Invalid Response")


main()
