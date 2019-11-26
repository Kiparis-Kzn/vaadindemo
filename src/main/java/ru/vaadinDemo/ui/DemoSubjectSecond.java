package ru.vaadinDemo.ui;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import ru.vaadinDemo.xmlParser.DomParserDemo;
//import SubjectDemo;


@SpringUI
public class DemoSubjectSecond extends UI {

    @Autowired
    private DomParserDemo domParserDemo;

    private VerticalLayout rootSubjectLayout;

    @Override
    protected void init(VaadinRequest request) {
        initRootSubjectLayout();
        button();
        //initTreeGridSubjectLayout();
    }

    private void initRootSubjectLayout() {
        rootSubjectLayout = new VerticalLayout();
        rootSubjectLayout.setMargin(new MarginInfo(true, true, false, true));
        rootSubjectLayout.setSizeFull();
        setContent(rootSubjectLayout);
    }

    private void button() {
        Button button = new Button("Do not press this button");

        button.addClickListener(clickEvent -> {
            domParserDemo.xmlDomParser();
        });
        rootSubjectLayout.addComponent(button);
    }

    private void initTreeGridSubjectLayout() {
        HorizontalLayout treeGridSubjectLayout = new HorizontalLayout();
        treeGridSubjectLayout.setSizeFull();
        treeGridSubjectLayout.setSpacing(false);
        rootSubjectLayout.addComponent(treeGridSubjectLayout);

        Panel treeSubjectPanel = new Panel("Субъекты");
        treeSubjectPanel.setWidth("250px");
        treeSubjectPanel.setHeight("100%");
        treeGridSubjectLayout.addComponents(treeSubjectPanel);

        Panel gridSubjectLayout = new Panel("Описание субъектов");
        gridSubjectLayout.setSizeFull();
        treeGridSubjectLayout.addComponents(gridSubjectLayout);
        treeGridSubjectLayout.setExpandRatio(gridSubjectLayout, 1.0f);

        Tree<String> treeSubject = new Tree<>("Субъекты");
        treeSubject.setSizeFull();
        TreeData<String> treeSubjectData = new TreeData<>();

        treeSubjectData.addItems(null, "Юр. лица", "Физ. лица")
                .addItems("Юр. лица", "AO", "OOO")
                .addItem("Физ. лица", "ИП1");
        treeSubject.setDataProvider(new TreeDataProvider<>(treeSubjectData));
        treeSubject.expand("Юр. лица", "Физ. лица");

        treeSubjectPanel.setContent(treeSubject);

        /*Grid<SubjectDemo> gridSubject = new Grid<>("Описание субъекта");
        gridSubject.setSizeFull();

        SubjectDemo subjectDemo = new SubjectDemo("ИП", "124234", "ИП1", "1", "31525235", "15525235", "6461346");
        SubjectDemo subjectDemo1 = new SubjectDemo("АО", "12423464165", "АО1", "2", "31542564125625235", "15521245235", "625215346");
        SubjectDemo subjectDemo2 = new SubjectDemo("ООО", "12423515234", "ООО1", "3", "3152536146235", "155555242421235", "2214346");

        List<SubjectDemo> subjectDemoList = Arrays.asList(subjectDemo, subjectDemo1, subjectDemo2);

        gridSubject.setItems(subjectDemoList);
        gridSubject.addColumn(SubjectDemo::getNameSubject).setCaption("Субъект");
        gridSubject.addColumn(SubjectDemo::getOkpo).setCaption("ОКПО");
        gridSubject.addColumn(SubjectDemo::getFullName).setCaption("Полное наименование");
        gridSubject.addColumn(SubjectDemo::getShortName).setCaption("Сокращенное наименование");
        gridSubject.addColumn(SubjectDemo::getInn).setCaption("ИНН");
        gridSubject.addColumn(SubjectDemo::getKpp).setCaption("КПП");
        gridSubject.addColumn(SubjectDemo::getOgrn).setCaption("ОГРН");

        gridSubjectLayout.setContent(gridSubject);*/
    }
}