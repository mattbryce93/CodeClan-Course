import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("Wired", 3);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canUpdateOutputDevice() {
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: Beep!", computer.outputData("Beep!"));
    }



    @Test
    public void hasInputDevice() {
        IInput inputDevice = computer.getInputDevice();
        assertNotNull(inputDevice);
    }

    @Test
    public void canInputData() {
        assertEquals("sending: some mail", computer.inputData("some mail"));
    }

    @Test
    public void canInputDataViaMouse() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Mouse mouse = new Mouse("Wired", 3);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("sending: a button click", computer.inputData("a button click"));
    }

    @Test
    public void canInputDataViaKeyboard() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Keyboard keyboard = new Keyboard("Wired", 50);
        computer = new Computer(8, 512, printer, keyboard);
        assertEquals("submitting: Click!", computer.inputData("Click!"));
    }

    @Test
    public void canUpdateInputDevice() {
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Keyboard keyboard = new Keyboard("Wired", 50);
        computer = new Computer(8, 512, printer, keyboard);
        Mouse mouse = new Mouse("Wired", 3);
        computer.setInputDevice(mouse);
        assertEquals("sending: a button click!", computer.inputData("a button click!"));
    }
}
