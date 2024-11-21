package org.maisprati;

import org.maisprati.doublyLinkedList.cardsInHand.CardsInHand;
import org.maisprati.doublyLinkedList.textEditor.TextEditor;
import org.maisprati.singlyLinkedList.browsingHistory.BrowsingHistory;
import org.maisprati.singlyLinkedList.taskManager.TaskManager;
import org.maisprati.singlyLinkedList.versionControlSystem.UndoManager;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws Exception {
        singlyLinkedListTaskManager();
        singlyLinkedListBrowsingHistory();
        singlyLinkedListVersionControlSystem();
        doublyLinkedListTextEditor();
        doublyLinkedListCardsInHand();
    }

    public static void doublyLinkedListCardsInHand() throws Exception {
        CardsInHand cardsInLeftHand = new CardsInHand();
        cardsInLeftHand.addCardToHand(12, "Amarelo");
        cardsInLeftHand.addCardToHand(13, "Azul");
        cardsInLeftHand.addCardToHand(14, "Verde");
        cardsInLeftHand.addCardToHand(15, "Branco");

        cardsInLeftHand.systemOutPrint();

        cardsInLeftHand.removeCard(1);
        cardsInLeftHand.systemOutPrint();

        cardsInLeftHand.reorganizeCards(0, 2);
        cardsInLeftHand.systemOutPrint();
    }

    public static void doublyLinkedListTextEditor() throws Exception {
        TextEditor myNotes = new TextEditor();
        myNotes.addText("Estou testando colocar uma linha aqui.");
        myNotes.addText("Estou testando colocar outra linha aqui.");

        myNotes.systemOutPrint();

        myNotes.undoLastModification();
        myNotes.addText("Estou adicionando um outro texto, porque acabei de desfazer a última modificação.");

        myNotes.systemOutPrint();

        myNotes.redoLastModification();
        myNotes.breakLine();
        myNotes.addText("Teste de quebra de linha.");

        myNotes.systemOutPrint();
    }

    public static void singlyLinkedListTaskManager(){
        TaskManager dailyTaskList = new TaskManager();
        dailyTaskList.addTaskToList("Estudar para prova de Matemática V");
        dailyTaskList.addTaskToList("Finalizar atividade de Java da +PraTi.");
        dailyTaskList.addTaskToList("Arrumar minha cama");
        dailyTaskList.addTaskToList("Estudar pra prova de Matemática III");

        dailyTaskList.setTaskComplete(0);
        dailyTaskList.systemOutPrint();

        dailyTaskList.removeTaskFromList(2);
        dailyTaskList.systemOutPrint();
    }

    public static void singlyLinkedListBrowsingHistory() throws MalformedURLException {
        BrowsingHistory myBrowsingHistory = new BrowsingHistory();
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Frontend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Educational-Chatbot");

        myBrowsingHistory.systemOutPrint();
        myBrowsingHistory.removeFromBrowsingHistory(3);

        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Frontend");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Educational-Chatbot");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/7-Estrutura-De-Dados/tree/main/src/main/java/org/maisprati");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/6-Netflix-Clone");
        myBrowsingHistory.addURLToBrowsingHistory("https://github.com/Yasmin-Carloto/Do-Menu-Backend");

        myBrowsingHistory.systemOutPrint();
    }

    public static void singlyLinkedListVersionControlSystem() throws Exception {
        UndoManager myNote = new UndoManager();
        myNote.addText("Estou testando colocar palavras.");
        myNote.addText("Agora estou testando colocar mais palavras.");

        myNote.systemOutPrint();
        myNote.undoLastModification();

        myNote.systemOutPrint();

        myNote.addText("Vamos quebrar a linha agora.");
        myNote.breakLine();

        myNote.addText("Quebrou a linha?!");

        myNote.systemOutPrint();
    }

    public static void dublyLinkedList(){

    }
}