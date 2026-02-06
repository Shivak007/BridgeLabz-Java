package javacollectionsandstreams.regexandjunit.junit.temperatureconverter;
public class TemperatureConverter {
    double cToF(double c) { return c * 9/5 + 32; }
    double fToC(double f) { return (f - 32) * 5/9; }
}
