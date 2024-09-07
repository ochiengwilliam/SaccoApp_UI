package com.example.sacco.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sacco.R

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopBar(modifier = Modifier.fillMaxWidth())
        }
    ) { paddingValues ->

        MainScreen(modifier = Modifier.padding(paddingValues))
    }
}

@Composable
fun MainScreen(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()) // Enable vertical scrolling for the content
            .padding(16.dp)
    ) {
        GreetingSection()
        Spacer(modifier = Modifier.height(16.dp))
        AccountMenuSection()
        Spacer(modifier = Modifier.height(16.dp))
        AccountMenuSection2()
        Spacer(modifier = Modifier.height(16.dp))
        AccountMenuSection3()
    }
}

@Composable
fun GreetingSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Good morning, FESTUS",
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 20.sp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "What would you like to do today?",
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp)
            )
        }
    }
}

@Composable
fun AccountMenuSection() {


    Box (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                RoundedCornerShape(8.dp))
            .padding(32.dp)

    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Account Menu",
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Grid for Account Menu Items
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(iconRes = R.drawable.person, text = "Profile")
                    MenuItem(iconRes = R.drawable.balances, text = "Balances")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(
                        iconRes = R.drawable.ic_statement, text = "Statement"
                    )
                    MenuItem(
                        iconRes = R.drawable.ic_statistics, text = "Statistics"
                    )
                }
            }
        }
    }

}


@Composable
fun AccountMenuSection2() {

    Box (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                RoundedCornerShape(8.dp))
            .padding(32.dp)

    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Transaction Menu",
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Grid for Account Menu Items
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(iconRes = R.drawable.deposit, text = "Deposit")
                    MenuItem(
                        iconRes = R.drawable.withdraw,
                        text = "M-PESA Withdraw"
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(
                        iconRes = R.drawable.transfers, text = "Accounts Transfer"
                    )
                    MenuItem(
                        iconRes = R.drawable.ic_statistics, text = "Statistics"
                    )
                }
            }
        }
    }

}

@Composable
fun AccountMenuSection3() {


    Box (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                RoundedCornerShape(8.dp))
            .padding(32.dp)

    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Loan Menu",
                style = MaterialTheme.typography.titleMedium.copy(fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Grid for Account Menu Items
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(
                        iconRes = R.drawable.loan_balance,
                        text = "Loan Balance"
                    )
                    MenuItem(iconRes = R.drawable.eloan, text = "E Loan")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MenuItem(
                        iconRes = R.drawable.calculator, text = "Loan Calculator"
                    )
                    MenuItem(
                        iconRes = R.drawable.guarantors, text = "Guarantors"
                    )
                }
            }
        }
    }

}


@Composable
fun MenuItem(iconRes: Int, text: String) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface, RoundedCornerShape(8.dp))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(height = 50.dp, width = 80.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = text, style = MaterialTheme.typography.bodyMedium)
    }
}
