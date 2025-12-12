# Java Practice Workspace

This repo is a collection of small, **standalone** Java programs for learning basics + DSA.

## Folder structure

All code now lives under `src/`:

- `src/basics/` — beginner programs (I/O, conditionals, small problems)
  - `functions_methods/` — functions & methods practice
  - `loops/` — loop practice
- `src/dsa/` — data structures & algorithms
  - `arrays/` — 1D arrays + `two_d/` for 2D arrays
  - `sorting/` — sorting algorithms
  - `strings/` — string problems
  - `recursion/` — recursion problems
- `src/oops/` — OOP concepts (inheritance, polymorphism, etc.)

## How to run a file

These files currently do **not** use `package` declarations (default package). The simplest way to run any program is:

1. Open a terminal in the workspace root.
2. `cd` into the folder containing the file.
3. Compile and run.

Example (run a recursion file):

```bash
cd "src/dsa/recursion"
javac Consecativeones.java
java Consecativeones
```

## Notes

- Some classes share the same class name in different folders (for example multiple `factorial.java`). Because everything is in the default package, compiling *every* file in one `javac` command can fail with "duplicate class" errors.
- If you later want, we can convert this into a standard Java project layout with real packages (e.g. `package dsa.arrays;`) so everything can compile together cleanly.
