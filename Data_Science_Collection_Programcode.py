# check Python version
!python -V

# Read the data from the IBM server into a pandas dataframe.

import pandas as pd # download library to read data into dataframe
pd.set_option('display.max_columns', None)

recipes = pd.read_csv("https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/IBMDeveloperSkillsNetwork-DS0103EN-SkillsNetwork/labs/Module%202/recipes.csv")

print("Data read into dataframe!") # takes about 30 seconds

# show first few rows 
recipes.head()

# show the dimensions of the dataframe
recipes.shape
