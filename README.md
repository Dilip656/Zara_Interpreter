# Zara Interpreter

A working interpreter for the **ZARA** scripting language built in pure Java.
Developed as part of the Advanced OOP course at **Sitare University**.

---

## How to Run

```bash
cd src
javac *.java
java Main ../programs/program1.zara
```

---

## ZARA Syntax

| Construct   | Example                  |
|-------------|--------------------------|
| Assignment  | `set x = 10`             |
| Print       | `show x` / `show "hi"`  |
| Conditional | `when x > 5:` + indent   |
| Loop        | `loop 3:` + indent       |
| Arithmetic  | `+  -  *  /`             |
| Comparisons | `>  <  ==`               |

---

## Sample Program

```
set x = 10
set y = 3
set result = x + y * 2
show result

when result > 10:
    show "Big number!"

loop 3:
    show "Hello from ZARA"
```

**Output:**
```
16
Big number!
Hello from ZARA
Hello from ZARA
Hello from ZARA
```

---

## How It Works

The interpreter runs in 3 stages:

1. **Tokenizer** — breaks source code into tokens
2. **Parser** — builds an instruction tree using recursive descent
3. **Evaluator** — walks the tree and executes each instruction

Operator precedence (`*` before `+`) is handled automatically by the parser's call chain: `parseExpression()` → `parseTerm()` → `parsePrimary()`.

---

## Expected Output for All 4 Programs

| Program | Tests | Output |
|---------|-------|--------|
| program1.zara | Arithmetic | `16` |
| program2.zara | Strings | `Sitare` / `Hello from ZARA` |
| program3.zara | Conditional | `Pass` |
| program4.zara | Loop | `1` `2` `3` `4` |

---

**Course:** Advanced OOP in Java | Sitare University
