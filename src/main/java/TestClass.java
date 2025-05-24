import com.example.demo.domain.Expense;
import com.example.demo.service.ExpenseService;
import com.example.demo.service.ExpenseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestClass {

    @Autowired
    ExpenseService expenseService;

    public void getData()
    {
        List<Expense> expenseList= expenseService.getAllExpenses("12121");
        if (expenseList.isEmpty())
            System.out.println("NOTHING TO SHOW");
        else
            System.out.println(expenseList);
    }

}
