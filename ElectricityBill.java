import static java.lang.IO.*;
import static java.lang.Integer.*;

void main()
{
	print("Enter you current reading : ");
	int currReading = parseInt(readln());

	print("Enter your current reading :");
	int prevReading = parseInt(readln());

	int numberOfCall=currReading - prevReading;
		println("The Current month number of call is:"+numberOfCall);
	double bill=0.0;

	if(numberOfCall<=100)
	{
		bill=360;
	}
	else if(numberOfCall<=250)
	{
		bill=360+(numberOfCall-100)*1.0;
	}
	else
	{
		bill=360+150+(numberOfCall-250)*1.2;
	}
	println("You bill for this month is:"+bill);
}