package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ContributorBest {
    @Test
    void secondCotributorSelenide(){
        //открыть страницу "Repositories" в "Selenide"
        open("https://github.com/selenide/selenide");
        // подвести курсор ко второму аватару из блока contributors
         $(".BorderGrid").$(byText("Contributors"))
                .ancestor(".BorderGrid-row").$$("ul li").get(1).hover();
         // проверить во всплывающем окне текст "Alexei Vinogradov"
        Selenide.$(".Popover-message").shouldHave(Condition.text("Alexei Vinogradov"));
         sleep(5000);
    }
}