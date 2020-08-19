import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getLogger();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i : source) {
            if (i < threshold) logger.log("Элемент " + i + " не подходит");
            else {
                logger.log("Элемент " + i + " подходит");
                result.add(i);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
