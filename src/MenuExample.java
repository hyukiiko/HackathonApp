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
        title.setForeground(new Color(29, 28, 26));
        title.setOpaque(true);
        title.setBackground(new Color(137, 207, 240));
        title.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        frame.add(title, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 15, 15)); // 4 rows, 1 column, spacing
        buttonPanel.setBackground(new Color(236, 240, 241));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        // Create buttons with custom colors
        JButton vocabButton = createStyledButton("Vocab", new Color(255, 209, 220));
        JButton scheduleButton = createStyledButton("Schedule", new Color(255, 238, 155));
        JButton campusButton = createStyledButton("Campus Resources", new Color(255, 109, 97));
        vocabButton.addActionListener(e -> {
            JFrame vocabFrame = new JFrame("Vocab");
            vocabFrame.setSize(400, 300);
            vocabFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


//Definitions taken from https://tips.hackathon.com/article/the-basic-hackathon-terms-you-should-know
            JTextArea textArea = new JTextArea();
            textArea.setText("*Blockchain-A logging technology that transactions depend on. It involves decentralization for security measures, and everything written here will stay here forever. " +
                    "\n*GitHub-This is a platform that they use to host the main source code for projects that are still under development" + "\n*Pitch-This is when hackathoners will sell their ideas. A pitch should last between three and five minutes." +
                    "\n*Open Source-This is a software source code that can be used for various purposes. Usually, these are tools that can be shared online. " + "\n\n*Definitions taken from https://tips.hackathon.com/article/the-basic-hackathon-terms-you-should-know");
            textArea.setFont(new Font("Serif", Font.PLAIN, 12));
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            JPanel panel = new JPanel(new BorderLayout());
            textArea.setBackground(new Color(223, 147, 147));

            JScrollPane scrollPane = new JScrollPane(textArea);
            panel.add(scrollPane, BorderLayout.CENTER);
            vocabFrame.add(panel);
            vocabFrame.setVisible(true);
            vocabFrame.setVisible(true);
        });
        scheduleButton.addActionListener(e -> {
            JFrame scheduleFrame = new JFrame("Hackathon Schedule");
            scheduleFrame.setSize(400, 300);
            scheduleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            scheduleFrame.setLayout(new BorderLayout());

            // Title label
            JLabel scTitle = new JLabel("Hackathon Schedule", SwingConstants.CENTER);
            scTitle.setFont(new Font("Arial", Font.BOLD, 26));
            scTitle.setForeground(new Color(29, 28, 26));
            scTitle.setOpaque(true);
            scTitle.setBackground(new Color(137, 207, 240));
            scTitle.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
            scheduleFrame.add(scTitle, BorderLayout.NORTH);

            // Panel for buttons
            JPanel scButtonPanel = new JPanel();
            scButtonPanel.setLayout(new GridLayout(4, 1, 15, 15)); // 4 rows, 1 column, spacing
            scButtonPanel.setBackground(new Color(236, 240, 241));
            scButtonPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

            // Create buttons with custom colors
            JButton fridayButton = createStyledButton("Friday", new Color(221, 112, 138));
            JButton saturdayButton = createStyledButton("Saturday", new Color(230, 206, 75));
            JButton sundayButton = createStyledButton("Sunday", new Color(175, 57, 46));
            // Add buttons to panel
            scButtonPanel.add(fridayButton);
            scButtonPanel.add(saturdayButton);
            scButtonPanel.add(sundayButton);

            // Add panel to frame
            scheduleFrame.add(scButtonPanel, BorderLayout.CENTER);
            scheduleFrame.setVisible(true);
        });
        campusButton.addActionListener(e -> {
            JFrame campusFrame = new JFrame("Hackathon Schedule");
            campusFrame.setSize(400, 300);
            campusFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            campusFrame.setLayout(new BorderLayout());

            // Title label
            JLabel campusTitle = new JLabel("Hackathon Schedule", SwingConstants.CENTER);
            campusTitle.setFont(new Font("Arial", Font.BOLD, 26));
            campusTitle.setForeground(new Color(29, 28, 26));
            campusTitle.setOpaque(true);
            campusTitle.setBackground(new Color(137, 207, 240));
            campusTitle.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
            campusFrame.add(campusTitle, BorderLayout.NORTH);

            // Panel for buttons
            JPanel campusButtonPanel = new JPanel();
            campusButtonPanel.setLayout(new GridLayout(4, 1, 15, 15)); // 4 rows, 1 column, spacing
            campusButtonPanel.setBackground(new Color(236, 240, 241));
            campusButtonPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

            // Create buttons with custom colors
            JButton oneButton = createStyledButton("OneStop", new Color(138, 77, 94));
            JButton emerButton = createStyledButton("Emergency", new Color(140, 126, 61));
            JButton healButton = createStyledButton("Health Center", new Color(142, 49, 47));
            // Add buttons to panel
            campusButtonPanel.add(oneButton);
            campusButtonPanel.add(emerButton);
            campusButtonPanel.add(healButton);

            // Add panel to frame
            campusFrame.add(campusButtonPanel, BorderLayout.CENTER);
            campusFrame.setVisible(true);
        });


        // Add buttons to panel
        buttonPanel.add(vocabButton);
        buttonPanel.add(scheduleButton);
        buttonPanel.add(campusButton);

        // Add panel to frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    private static JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Serif", Font.BOLD, 16));
        button.setForeground(new Color(29,28,4));
        button.setBackground(bgColor);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}

