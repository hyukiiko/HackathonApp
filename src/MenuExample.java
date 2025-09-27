import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hackathon Helper");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title label
        JLabel title = new JLabel("Hackathon Helper", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setForeground(new Color(29,28,26)); // title text color
        title.setOpaque(true);
        title.setBackground(new Color(137, 207, 240)); // dark navy header
        title.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        frame.add(title, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 15, 15)); // 4 rows, 1 column, spacing
        buttonPanel.setBackground(new Color(236, 240, 241)); // light gray background
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        // Create buttons with custom colors
        JButton vocabButton = createStyledButton("Vocab", new Color(255, 209, 220));
        JButton scheduleButton = createStyledButton("Schedule", new Color(255, 238, 155));
        JButton campusButton = createStyledButton("Campus Resources", new Color(255, 109, 97));
        vocabButton.addActionListener(e -> {
            JFrame vocabFrame = new JFrame("Vocab");
            vocabFrame.setSize(400, 300);
            vocabFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(new Color(236, 240, 241));

            JLabel vocabLabel = new JLabel("Vocab Helpful for Hackathon!", SwingConstants.CENTER);
            vocabLabel.setFont(new Font("Arial", Font.PLAIN, 18));
            JTextArea textArea = new JTextArea();
            textArea.setText("*Blockchain-A logging technology that transactions depend on. It involves decentralization for security measures, and everything written here will stay here forever. "+
                    "\nGitHub-This is a platform that they use to host the main source code for projects that are still under development");
            textArea.setFont(new Font("Arial", Font.PLAIN, 16));
            textArea.setEditable(false); // user can't type
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);


            JScrollPane scrollPane = new JScrollPane(textArea);
            panel.add(scrollPane, BorderLayout.CENTER);

            vocabFrame.add(panel);
            vocabFrame.setVisible(true);
            vocabFrame.add(vocabLabel);
            vocabFrame.setVisible(true);
        });

        // Add buttons to panel
        buttonPanel.add(vocabButton);
        buttonPanel.add(scheduleButton);
        buttonPanel.add(campusButton);

        // Add panel to frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Actions for buttons (temporary popups)
        scheduleButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Schedule Section Coming Soon!"));
        campusButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Campus Resources Coming Soon!"));
        frame.setVisible(true);
    }
    private static JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Serif", Font.BOLD, 16));
        button.setForeground(new Color(29,28,26));
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}

