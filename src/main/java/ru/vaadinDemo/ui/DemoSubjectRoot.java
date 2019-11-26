package ru.vaadinDemo.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.*;
//import SubjectDemo;


//@SpringUI
@Theme("valo")
public class DemoSubjectRoot extends UI {

    private HorizontalLayout rootLayout;
    private VerticalLayout treeRootLayout;
    private VerticalLayout gridRootLayout;

    @Override
    protected void init(VaadinRequest request) {

        setupRootLayout();
        setupSplitPanel();
    }

    private void setupRootLayout() {
        rootLayout = new HorizontalLayout();
        //rootLayout.setMargin(false);
        //rootLayout.setSpacing(false);
        rootLayout.setSizeFull();
        setContent(rootLayout);
    }

    private void setupSplitPanel() {
        setupTreeLayout();
        setupGridLayout();
        HorizontalSplitPanel hsplit = new HorizontalSplitPanel(treeRootLayout, gridRootLayout);
        hsplit.setSizeFull();
        hsplit.setSplitPosition(20);
        rootLayout.addComponent(hsplit);
    }

    private void setupTreeLayout() {
        treeRootLayout = new VerticalLayout();
        treeRootLayout.setMargin(new MarginInfo(true, true, true, true));
        //treeRootLayout.setSpacing(false);
        treeRootLayout.setWidth("250px");
        treeRootLayout.setHeight("100%");
        CssLayout treeGridCssLayout = new CssLayout();
        treeGridCssLayout.setSizeFull();
        Tree<String> treeSubject = new Tree<>("Субъекты");
        treeSubject.setSizeFull();
        TreeData<String> treeSubjectData = new TreeData<>();

        treeSubjectData.addItems(null, "Юр. лица", "ИП", "Физ. лица")
                .addItems("Юр. лица", "AO", "OOO")
                .addItem("ИП", "ИП1");
        treeSubject.setDataProvider(new TreeDataProvider<>(treeSubjectData));
        //treeSubject.expand("Юр. лица", "ИП", "Физ. лица");

        treeGridCssLayout.addComponent(treeSubject);
        treeRootLayout.addComponent(treeGridCssLayout);
    }

    private void setupGridLayout() {
        gridRootLayout = new VerticalLayout();
        gridRootLayout.setMargin(new MarginInfo(true, false, true, false));
        //gridRootLayout.setSpacing(false);
        gridRootLayout.setSizeFull();
        CssLayout gridCssLayout = new CssLayout();
        gridCssLayout.setSizeFull();
        /*Grid<SubjectDemo> gridSubject = new Grid<>("Описание субъекта");
        gridSubject.setSizeFull();

        SubjectDemo subjectDemo = new SubjectDemo("ИП", "124234", "ИП1", "1", "31525235", "15525235", "6461346");
        SubjectDemo subjectDemo1 = new SubjectDemo("АО", "12423464165", "АО1", "2", "31542564125625235", "15521245235", "625215346");
        SubjectDemo subjectDemo2 = new SubjectDemo("ООО", "12423515234", "ООО1", "3", "3152536146235", "155555242421235", "2214346");

        List<SubjectDemo> subjectDemoList = Arrays.asList(subjectDemo,
                subjectDemo1,
                subjectDemo2);

        gridSubject.setItems(subjectDemoList);
        gridSubject.addColumn(SubjectDemo::getNameSubject).setCaption("Субъект");
        gridSubject.addColumn(SubjectDemo::getOkpo).setCaption("ОКПО");
        gridSubject.addColumn(SubjectDemo::getFullName).setCaption("Полное наименование");
        gridSubject.addColumn(SubjectDemo::getShortName).setCaption("Сокращенное наименование");
        gridSubject.addColumn(SubjectDemo::getInn).setCaption("ИНН");
        gridSubject.addColumn(SubjectDemo::getKpp).setCaption("КПП");
        gridSubject.addColumn(SubjectDemo::getOgrn).setCaption("ОГРН");

        gridCssLayout.addComponent(gridSubject);
        gridRootLayout.addComponent(gridCssLayout);*/
    }
}
