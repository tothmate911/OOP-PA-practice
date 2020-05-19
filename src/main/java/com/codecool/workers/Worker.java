package com.codecool.workers;

public abstract class Worker {
    private String name;
    private int generalWholeDailyFee = 40000;
    private int actualDailyFee;
    private int companyPartOfTheFee;

    protected int chanceOfWorkPercentage;
    private boolean isSecretary;
    private Experience experience;

    public Worker(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public boolean isThereJob() {
        return  Util.getRandom(1, 100) <= chanceOfWorkPercentage;
    }

    public void workADay() {
        if (isThereJob()) {
            actualDailyFee = (int) (generalWholeDailyFee * this.experience.feeToKeepRate);
            companyPartOfTheFee = generalWholeDailyFee - actualDailyFee;
        } else {
            actualDailyFee = 0;
            companyPartOfTheFee = 0;
        }
    }

    public int dailyIncomeOfWorker() {
        int dailyIncome = 0;
        if (isThereJob()) {
            dailyIncome = (int) (generalWholeDailyFee * this.experience.feeToKeepRate);
        }
        return dailyIncome;
    }

    public int getToolExpense() {
        return 0;
    }
}
