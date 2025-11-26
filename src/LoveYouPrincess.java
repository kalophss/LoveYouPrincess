
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class   LoveYouPrincess {


    private List<String> loveMessages;
    private JLabel messageLabel;
    private Random random;
    private String currentMessage;

    public LoveYouPrincess() {
        loveMessages = new ArrayList<>();
        loveMessages.add("ΣΕ ΑΓΑΠΩ ΠΟΛΥ ΠΟΛΥ ΜΩΡΑΚΙ ΜΟΥΥΥΥΥΥ❤❤❤");
        loveMessages.add("ΣΕ ΘΕΛΩ ΣΤΗΝ ΖΩΗ ΜΟΥ ΟΣΟ ΤΙΠΟΤΑ ΣΤΟΝ ΚΟΣΜΟΟΟ");
        loveMessages.add("ΚΑΘΕ ΛΕΠΤΟ ΜΑΚΡΙΑ ΣΟΥ ΜΟΥ ΦΑΙΝΕΤΑΙ ΣΑΝ ΑΙΩΝΑΣΣΣ");
        loveMessages.add("ΛΑΤΡΕΥΩ ΚΑΘΕ ΛΕΠΤΟΜΕΡΕΙΑ ΓΙΑ ΣΕΝΑΑΑ");
        loveMessages.add("ΝΙΩΘΩ ΠΕΡΗΦΑΝΟΣ ΠΟΥ ΣΕ ΕΧΩ ΓΙΑ ΓΥΝΑΙΚΑ ΜΟΥΥΥΥ*(μελλουσα-λεπτομερειες τωρα)");
        loveMessages.add("ΕΙΣΑΙ Η ΠΙΟ ΥΠΕΡΟΧΗ ΓΥΝΑΙΚΑ ΠΟΥ ΕΧΩ ΓΝΩΡΙΣΕΙΙΙΙ");
        loveMessages.add("ΕΙΣΑΙ Η ΠΙΟ ΟΜΟΡΦΗ ΠΡΙΓΚΗΠΙΣΣΑΑΑ(καμια σχεση με αυτες της ντισνευ εννοειται)");
        loveMessages.add("ΑΝΥΠΟΜΟΝΩ ΝΑ ΧΤΙΣΟΥΜΕ ΤΟ ΜΕΛΛΟΝ ΜΑΣ ΜΑΖΙΙΙΙΙΙ");
        loveMessages.add("ΘΕΛΩ ΚΑΘΕ ΔΕΥΤΕΡΟΛΕΠΤΟ ΝΑ ΕΙΜΑΙ ΜΑΖΙ ΣΟΥΥΥΥΥ");
        loveMessages.add("ΛΑΤΡΕΥΩ ΝΑ ΣΕ ΒΛΕΠΩ ΝΑ ΧΑΜΟΓΕΛΑΣΣΣΣ");
        loveMessages.add("ΘΑ ΕΙΜΑΙ ΠΑΝΤΑ ΔΙΠΛΑ ΣΟΥ ΝΑ ΣΕ ΣΤΗΡΙΖΩ ΣΕ Ο,ΤΙ ΧΡΕΙΑΣΤΕΙΣΣΣ");
        loveMessages.add("ΘΕΛΩ ΝΑ ΣΕ ΒΛΕΠΩ ΝΑ ΠΕΤΥΧΑΙΝΕΙΣ ΤΟΥΣ ΣΤΟΧΟΥΣ ΣΟΥΥΥΥ");
        loveMessages.add("ΕΙΣΑΙ Η ΠΙΟ ΔΥΝΑΤΗ ΓΥΝΑΙΚΑ ΠΟΥ ΕΧΩ ΓΝΩΡΙΣΕΙΙΙ");
        loveMessages.add("ΑΓΑΠΩ ΤΟΝ ΤΡΟΠΟ ΠΟΥ ΜΕ ΦΡΟΝΤΙΖΕΙΣΣΣ");
        loveMessages.add("ΧΑΝΟΜΑΙ ΣΤΑ ΠΑΝΕΜΟΡΦΑ ΜΑΤΙΑ ΣΟΥ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΣΕ ΒΛΕΠΩΩΩ");
        loveMessages.add("ΑΓΑΠΩ ΤΟΝ ΤΡΟΠΟ ΠΟΥ ΜΟΥ ΔΕΙΧΝΕΙΣ ΚΑΘΕ ΦΟΡΑ ΠΩΣ ΜΕ ΣΚΕΦΤΕΣΑΙΙΙ");
        loveMessages.add("ΑΓΑΠΩ ΤΟ ΠΩΣ ΜΕ ΤΣΙΜΠΑΣΣΣΣ");
        loveMessages.add("ΑΓΑΠΩ ΤΟ ΠΩΣ ΜΕ ΔΑΓΚΩΝΕΙΣΣΣΣ");
        loveMessages.add("ΜΕ ΑΦΗΝΕΙΣ ΑΦΩΝΟ ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΣΕ ΒΛΕΠΩΩΩΩ");
        loveMessages.add("ΑΝ ΕΧΩ ΜΟΝΟ ΕΣΕΝΑ ΜΠΟΡΩ ΝΑ ΚΑΤΑΦΕΡΩ ΤΑ ΠΑΝΤΑΑΑΑΑ");
        loveMessages.add("ΠΑΝΤΑ ΘΑ ΣΕ ΒΑΖΩ ΠΑΝΩ ΑΠΟ ΟΛΟΥΣ ΚΑΙ ΑΠΟ ΟΛΑΑΑΑΑ");
        loveMessages.add("ΕΙΣΑΙ ΤΟ ΔΙΑΜΑΝΤΙ ΜΟΥΥΥΥΥΥ");
        loveMessages.add("ΑΓΑΠΩ ΤΙΣ ΕΚΔΡΟΜΕΣ ΜΑΣΣΣ");
        loveMessages.add("ΘΕΛΩ ΝΑ ΣΟΥ ΔΩΣΩ ΟΛΟ ΤΟΝ ΚΟΣΜΟΟΟ");
        loveMessages.add("ΕΙΣΑΙ Ο ΕΡΩΤΑΣ ΤΗΣ ΖΩΗΣ ΜΟΥΥΥΥΥΥ");
        loveMessages.add("ΑΓΑΠΩ ΤΟ ΝΑ ΞΥΠΝΑΩ ΜΕ ΕΣΕΝΑ ΣΤΗΝ ΑΓΚΑΛΙΑ ΜΟΥΥΥ");
        loveMessages.add("ΤΑ ΦΙΛΙΑ ΣΟΥ ΜΕ ΣΚΛΑΒΩΝΟΥΝΝΝ");
        loveMessages.add("ΕΧΩ ΕΘΙΣΤΕΙ ΣΤΗΝ ΜΥΡΩΔΙΑ ΣΟΥΥΥ");
        loveMessages.add("ΕΙΣΑΙ ΤΟ ΑΣΤΕΡΙ ΜΟΥΥΥΥΥΥ");
        loveMessages.add("ΜΕ ΚΑΘΕ ΣΟΥ ΑΓΓΙΓΜΑ ΛΙΩΝΩΩΩ");
        loveMessages.add("ΜΑΖΙ ΣΟΥ Ο ΚΟΣΜΟΣ ΑΠΟΚΤΑ ΧΡΩΜΑΑΑ");
        loveMessages.add("ΚΑΘΕ ΦΟΡΑ ΠΟΥ ΣΕ ΒΛΕΠΩ ΓΙΝΕΣΑΙ ΟΛΟ ΚΑΙ ΠΙΟ ΟΜΟΡΦΗΗΗΗ");
        loveMessages.add("ΕΙΣΑΙ ΑΚΟΜΑ ΠΙΟ ΓΛΥΚΟΥΛΑ ΑΠΤΟΥΣ ΜΟΝΟΚΕΡΟΥΣΣΣΣ(ασε που εσυ εισαι και αληθινη)");

        random = new Random();
        System.out.println("Image exists? " + new java.io.File("images/1.png").exists());

        // Δημιουργία του βασικού παραθύρου (JFrame)
        JFrame frame = new JFrame("Για την πριγκίπησσα μουυυυ!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.setLayout(new BorderLayout(10, 10));
        frame.getContentPane().setBackground(new Color(255, 220, 240)); // Ροζ φόντο

// --- 1. Πάνελ με 3 Στατικές Εικόνες στην κορυφή (NORTH) ---
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Κεντράρισμα με κενά
        northPanel.setOpaque(false); // Διαφανές για να φαίνεται το ροζ φόντο του frame
        ImageIcon icon = new ImageIcon("src/images/3.png");
        Image img = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        northPanel.add(new JLabel(new ImageIcon(img)));
        ImageIcon icon1 = new ImageIcon("src/images/4.png");
        Image img1 = icon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        northPanel.add(new JLabel(new ImageIcon(img1)));
        ImageIcon icon2 = new ImageIcon("src/images/5.png");
        Image img2 = icon2.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        northPanel.add(new JLabel(new ImageIcon(img2)));
        frame.add(northPanel, BorderLayout.NORTH);


        // Δημιουργία του πεδίου κειμένου (JLabel) για εμφάνιση των μηνυμάτων
        messageLabel = new JLabel("Πάτησε το κουμπί για μια έκπληξη!", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Serif", Font.BOLD, 22));
        messageLabel.setForeground(new Color(250, 0, 200)); // Σκούρο ροζ/μωβ χρώμα κειμένου

        // Δημιουργία του κουμπιού (JButton)
        JButton surpriseButton = new JButton("Πες μου γιατί μ' αγαπάς!");
        surpriseButton.addActionListener(this::onSurpriseButtonClick);
        surpriseButton.setBackground(new Color(255, 100, 150)); // Χρώμα κουμπιού
        surpriseButton.setForeground(Color.WHITE);
        //Δημιουργία κουμπιού αποθήκευσης(JButton)
        JButton saveButton = new JButton("Save as Favourite");
        saveButton.addActionListener(e -> saveFavorite(currentMessage));
        frame.add(saveButton, BorderLayout.WEST);


        // Προσθήκη των στοιχείων στο παράθυρο
        frame.add(messageLabel, BorderLayout.CENTER);
        frame.add(surpriseButton, BorderLayout.SOUTH);


        // Κάνουμε το παράθυρο ορατό
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        // Κεντράρει το παράθυρο στην οθόνη


    }

    /**
     * Η μέθοδος που καλείται όταν πατιέται το κουμπί.
     */
    private void onSurpriseButtonClick(ActionEvent e) {
        // Επιλέγει τυχαία ένα μήνυμα από τη λίστα
        int index = random.nextInt(loveMessages.size());
        String randomMessage = loveMessages.get(index);


        // Ενημερώνει το κείμενο στην οθόνη
        messageLabel.setText(randomMessage);
        currentMessage = randomMessage;
    }

    private void saveFavorite(String lovemessages) {
        try (FileWriter writer = new FileWriter("favorites.txt", true)) {
            writer.write(lovemessages + System.lineSeparator());
            JOptionPane.showMessageDialog(null, "Το μήνυμα αποθηκεύτηκε!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Το μήνυμα δεν αποθηκεύτηκε!", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

        }
    }


    /**
     * Η κύρια μέθοδος εκτέλεσης της εφαρμογής.
     */
    public static void main(String[] args) {
        // Εκτελεί το GUI thread με ασφάλεια (standard πρακτική Swing)
        SwingUtilities.invokeLater(LoveYouPrincess::new);


    }
}
