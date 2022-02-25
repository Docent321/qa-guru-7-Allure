package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Test
    void baseTest(){
        //Открыть Гитхаб
        open("https://github.com/");
        //Ввести в поиск название страницы "Docent321/qa_guru_2"
        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Docent321/qa_guru_2");
        $(".header-search-input").submit();
        //Проверка, что искомый репозиторий есть на странице
        $(".repo-list").should(text("Docent321/qa_guru_2"));
        $(By.linkText("Docent321/qa_guru_2")).click();
        //Проверить наличие поля Issue
        $("#issues-tab").should(text("issues"));



    }
}
