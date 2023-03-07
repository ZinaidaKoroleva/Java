package Homeworks.Homework6;

public class Laptop {
    private String model;  // Модель
    private Integer ram; // объем оперативной памяти
    private Integer ssd;  // объем ссд диска
    private String operatingSystem; // операционная система
    private String color;  // цвет
    private String processorModel; // модель процессора
    private Integer numberOfCores; // количество ядер процессора
    private Integer screen; // Диагональ экрана

    public Laptop(String model, Integer ram, Integer ssd, String operatingSystem, String color, String processorModel,
            Integer numberOfCores, Integer screen) {
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.processorModel = processorModel;
        this.numberOfCores = numberOfCores;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Ноутбук " + model + ", Объем оперативной памяти: " + ram + ", Объем SSD диска: " + ssd + ", Операционная система: " + operatingSystem
                + ", Цвет: " + color + ", Модель процессора: " + processorModel + ", Количество ядер процессора: " + numberOfCores
                + ", Диагональ экрана: " + screen + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((ssd == null) ? 0 : ssd.hashCode());
        result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((processorModel == null) ? 0 : processorModel.hashCode());
        result = prime * result + ((numberOfCores == null) ? 0 : numberOfCores.hashCode());
        result = prime * result + ((screen == null) ? 0 : screen.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (ssd == null) {
            if (other.ssd != null)
                return false;
        } else if (!ssd.equals(other.ssd))
            return false;
        if (operatingSystem == null) {
            if (other.operatingSystem != null)
                return false;
        } else if (!operatingSystem.equals(other.operatingSystem))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (processorModel == null) {
            if (other.processorModel != null)
                return false;
        } else if (!processorModel.equals(other.processorModel))
            return false;
        if (numberOfCores == null) {
            if (other.numberOfCores != null)
                return false;
        } else if (!numberOfCores.equals(other.numberOfCores))
            return false;
        if (screen == null) {
            if (other.screen != null)
                return false;
        } else if (!screen.equals(other.screen))
            return false;
        return true;
    }

    public String getModel() {
        return model;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public Integer getScreen() {
        return screen;
    }


}
