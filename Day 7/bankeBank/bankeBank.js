let userData = [];

function menu() {
    console.log(`
===========
BANKE BANK
===========

1. Create an account 
2. Close account 
3. Deposit money
4. Withdraw Money
5. Check Account balance
6. Transfer from one account to another
7. Change pin
`);
    let userSelection = parseInt(prompt('Enter your choice: '));
    switch (userSelection) {
        case 1:
            bankMenu();
            break;
        case 2:
            closedAccount();
            break;
        case 3:
            deposit();
            break;
        case 4:
            withdraw();
            break;
        case 5:
            checkBalance();
            break;
        case 6:
            transfer();
            break;
        case 7:
            changePin();
            break;
        default:
            console.log('Invalid choice');
            menu();
            break;
    }
}

function bankMenu() {
    let firstName = prompt('Enter first name? ');
    let lastName = prompt('Enter last name? ');
    let pin = prompt('Enter pin ');

    console.log('Account successfully created');
    
    userData.push(firstName);
    userData.push(lastName);
    userData.push(pin);

    menu();
}

function closedAccount() {
    let accountClose = prompt('Are you sure you want to close this account? YES/NO ');
    while (accountClose !== 'yes' && accountClose !== 'no') {
        console.log('Please enter yes or no');
        accountClose = prompt('Are you sure you want to close this account? YES/NO ');
    }

    if (accountClose === 'yes') {
        let pin = prompt('Enter pin ');

        if (userData.length >= 3 && pin === userData[2]) {
            console.log('Account closed successfully.');
        } else {
            console.log('Account not found\nplease open one or try the password again');
        }
    }

    menu();
}

function deposit() {
    let pin = prompt('Enter pin ');

    if (userData.length >= 3 && pin === userData[2]) {
        let amountDeposit = parseInt(prompt('How much do you want to deposit '));

        let accountBalance = 0;
        accountBalance += amountDeposit;
        console.log(`#${amountDeposit} successfully deposited`);
    } else {
        console.log('Invalid pin. Create an account and set a pin. If you already have an account please try the password again');
    }

    menu();
}

function withdraw() {
    let pin = prompt('Enter pin ');

    if (userData.length >= 3 && pin === userData[2]) {
        let withdraw = parseInt(prompt('How much do you want to withdraw '));

        let accountBalance = 0;

        if (withdraw > accountBalance) {
            console.log("No funds. please deposit");
        } else {
            accountBalance -= withdraw;
            console.log(`#${withdraw} successfully withdrawn`);
        }
    } else {
        console.log('Invalid pin. Create an account and set a pin. If you already have an account please try the password again');
    }

    menu();
}

function checkBalance() {
    let pin = prompt('Enter pin ');

    if (userData.length >= 3 && pin === userData[2]) {
        let accountBalance = 0;

        console.log(`Your account balance is #${accountBalance}`);
    } else {
        console.log('Invalid pin. Create an account and set a pin. If you already have an account please try the password again');
    }

    menu();
}

function transfer() {
    let pin = prompt('Enter pin ');

    if (userData.length >= 3 && pin === userData[2]) {
        let accountBalance = 0;

        let bank = prompt('What bank do you want to transfer to? ');
        let accountNumber = prompt('What is the account number ');
        let transferAmount = parseInt(prompt('How much are you sending? '));

        if (transferAmount > accountBalance) {
            console.log("Werey wan scam bank");
        } else {
            accountBalance -= transferAmount;
            console.log(`#${transferAmount} has successfully been sent`);
        }
    } else {
        console.log('Invalid pin. Create an account and set a pin. If you already have an account please try the password again');
    }

    menu();
}

function changePin() {
    let pin = prompt('Enter pin ');

    if (userData.includes(pin)) {
        let currentPin = prompt('Enter current pin ');
        if (currentPin === pin) {
            let newPin = prompt('Enter new pin ');
            userData[2] = newPin;
            console.log('PIN successfully changed');
        } else {
            console.log('Invalid pin. please try password again');
        }
    } else {
        console.log('Invalid pin. Create an account and set a pin. If you already have an account please try the password again');
    }

    menu();
}

menu();
