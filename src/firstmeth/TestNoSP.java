package firstmeth;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestNoSP extends Frame
        implements ActionListener {
    // GUI attributes.
    private Button pushButton = new Button("Push Operation");
    private Button pullButton = new Button("Pull Operation");
    private Button exitButton = new Button("Exit");
    private Canvas canvas = new Canvas();
    private ContextNoSP context = null;

    public TestNoSP() {
        super("No State Pattern");
        context = new ContextNoSP();
        setupWindow();
    }

    private void setupWindow() { // Setup GUI
        canvas.setBackground(Color.red);
        canvas.setSize(200,100);
        pushButton.setForeground(Color.black);
        pullButton.setForeground(Color.black);
        exitButton.setForeground(Color.black);
        this.setLayout(new FlowLayout());
        this.add(pushButton);
        this.add(pullButton);
        this.add(exitButton);
        this.add(canvas);
        pushButton.addActionListener(this);
        pullButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    @Override
        public void actionPerformed (ActionEvent event){
            Object src = event.getSource();
            if (src == pushButton) {
                context.push();
                canvas.setBackground(context.getState());
            } else if (src == pullButton) {
                context.pull();
                canvas.setBackground(context.getState());
            } else if (src == exitButton) {
                System.exit(0);
            }
        }
    public static void main(String[] argv) {
        TestNoSP gui = new TestNoSP();
        gui.setVisible(true);
    }
    }



