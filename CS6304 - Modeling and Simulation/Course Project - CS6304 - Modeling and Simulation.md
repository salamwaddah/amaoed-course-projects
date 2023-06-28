Activity #1 - Create a Matrix, Test the Elements and find the results using Scilab.

#### 1. Create a 5x5 Matrix named ModSim using random integers of up to 100.

```scilab
ModSim = round(rand(5, 5) * 100);
disp(ModSim);
```

#### 2. Test if elements of ModSim have less than 60.

```scilab
lessThan60 = find(ModSim < 60);
disp(lessThan60);
```

#### 3. Find for the elements on each column that are less than 60 (extract the elements per column)

```scilab
columnsLessThan60 = [];

for i = 1:size(ModSim, 2)
    column = ModSim(:, i);
    elementsLessThan60 = column(column < 60);
    columnsLessThan60 = [columnsLessThan60, elementsLessThan60];
end

disp(columnsLessThan60);
```

#### 4. Test if elements of ModSim have greater than 28

```scilab
greaterThan28 = find(ModSim > 28);
disp(greaterThan28);
```

#### 5. Find for the elements on which column that are greater than 28 (extract the elements per column)

```scilab
columnsGreaterThan28 = [];

for i = 1:size(ModSim, 2)
    column = ModSim(:, i);
    elementsGreaterThan28 = column(column > 28);
    columnsGreaterThan28 = [columnsGreaterThan28, elementsGreaterThan28];
end

disp(columnsGreaterThan28);
```
