
public class App
{
	public static void main(String[] args)
	{
		// Composition
		ConsoleLogWriter logWriter = new ConsoleLogWriter();

		Logger logger = new Logger(logWriter);

		logger.write("Hello there.I'm using composition");

		// Inheritance
		ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();
		Logger logger2 = new Logger(logWriter2);

		logger2.write("Hello there.I'm using inheritance");
	}
}
