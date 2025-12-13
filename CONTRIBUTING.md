# Contributing to Java-DSA-OOPS-Complete

Thank you for your interest in contributing to this Java DSA & OOPs learning repository! 🎉

We welcome contributions from developers of all skill levels. Whether you're fixing bugs, adding new data structures/algorithms, improving documentation, or enhancing existing code, your help is appreciated!

## Table of Contents
- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Contribution Guidelines](#contribution-guidelines)
- [Coding Standards](#coding-standards)
- [Commit Message Guidelines](#commit-message-guidelines)
- [Pull Request Process](#pull-request-process)

## Code of Conduct

This project adheres to a code of conduct that all contributors are expected to follow:
- Be respectful and inclusive
- Use welcoming and inclusive language
- Accept constructive criticism gracefully
- Focus on what is best for the community
- Show empathy towards other community members

## How Can I Contribute?

### 1. Reporting Bugs
- Check if the bug has already been reported in Issues
- If not, create a new issue with a clear title and description
- Include steps to reproduce, expected behavior, and actual behavior
- Add relevant code snippets or screenshots if applicable

### 2. Suggesting Enhancements
- Open an issue with the tag "enhancement"
- Clearly describe the feature and its potential benefits
- Explain why this enhancement would be useful

### 3. Code Contributions
- Implementing new data structures or algorithms
- Adding problem solutions with detailed explanations
- Improving existing code efficiency or readability
- Writing or improving documentation
- Adding unit tests

## Getting Started

1. **Fork the Repository**
   ```bash
   # Click the 'Fork' button at the top right of the repository page
   ```

2. **Clone Your Fork**
   ```bash
   git clone https://github.com/YOUR-USERNAME/Java-DSA-OOPS-Complete.git
   cd Java-DSA-OOPS-Complete
   ```

3. **Create a Branch**
   ```bash
   git checkout -b feature/your-feature-name
   # or
   git checkout -b fix/your-bug-fix
   ```

4. **Make Your Changes**
   - Write clean, readable code
   - Follow the coding standards outlined below
   - Test your changes thoroughly

5. **Commit Your Changes**
   ```bash
   git add .
   git commit -m "Your descriptive commit message"
   ```

6. **Push to Your Fork**
   ```bash
   git push origin feature/your-feature-name
   ```

7. **Create a Pull Request**
   - Go to the original repository
   - Click "New Pull Request"
   - Select your fork and branch
   - Fill in the PR template with details

## Contribution Guidelines

### Adding New Content

#### Data Structures & Algorithms
- Place files in appropriate directories
- Include comprehensive comments explaining the logic
- Add time and space complexity analysis
- Provide example usage in comments or separate examples

#### Problem Solutions
- Include the problem statement as a comment
- Explain the approach and algorithm used
- Add complexity analysis
- Provide multiple solutions if applicable (brute force, optimized)

#### OOPs Concepts
- Create clear, practical examples
- Include real-world use cases
- Explain concepts with comments
- Follow OOP best practices

### Documentation
- Keep README.md and other docs up to date
- Use clear and concise language
- Include code examples where helpful
- Check for spelling and grammar

## Coding Standards

### Java Style Guidelines

1. **Naming Conventions**
   - Classes: `PascalCase` (e.g., `BinarySearchTree`)
   - Methods: `camelCase` (e.g., `insertNode`)
   - Variables: `camelCase` (e.g., `currentNode`)
   - Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_SIZE`)

2. **Code Structure**
   ```java
   /**
    * Class description
    * @author Your Name
    */
   public class ExampleClass {
       // Constants
       private static final int MAX_VALUE = 100;
       
       // Instance variables
       private int value;
       
       // Constructor
       public ExampleClass(int value) {
           this.value = value;
       }
       
       // Methods
       public void exampleMethod() {
           // Implementation
       }
   }
   ```

3. **Comments**
   - Use JavaDoc for classes and public methods
   - Add inline comments for complex logic
   - Explain the "why" not just the "what"

4. **Code Quality**
   - Keep methods focused and concise
   - Avoid code duplication (DRY principle)
   - Handle edge cases and exceptions
   - Write self-documenting code

### Example Structure
```java
/**
 * Binary Search implementation
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * 
 * @author Your Name
 */
public class BinarySearch {
    /**
     * Performs binary search on a sorted array
     * 
     * @param arr Sorted array of integers
     * @param target Element to search for
     * @return Index of target element, -1 if not found
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
```

## Commit Message Guidelines

Write clear and meaningful commit messages:

- Use present tense ("Add feature" not "Added feature")
- Use imperative mood ("Move cursor to..." not "Moves cursor to...")
- Limit the first line to 72 characters
- Reference issues and pull requests when relevant

**Examples:**
```
Add bubble sort implementation
Fix null pointer exception in LinkedList
Update README with installation instructions
Refactor BinaryTree traversal methods
```

## Pull Request Process

1. **Before Submitting**
   - Ensure your code compiles without errors
   - Test your changes thoroughly
   - Update documentation if needed
   - Make sure your branch is up to date with main

2. **PR Description**
   - Clearly describe what changes you've made
   - Explain why these changes are necessary
   - Reference any related issues
   - Include screenshots for UI changes (if applicable)

3. **Review Process**
   - Be patient and responsive to feedback
   - Make requested changes promptly
   - Engage in constructive discussion
   - Once approved, your PR will be merged!

4. **After Merge**
   - Delete your branch (optional)
   - Update your fork
   ```bash
   git checkout main
   git pull upstream main
   ```

## Questions?

If you have any questions or need help:
- Open an issue with the "question" label
- Check existing issues and discussions
- Reach out to the maintainers

Thank you for contributing to Java-DSA-OOPS-Complete! Your efforts help make this a valuable learning resource for everyone. 🚀

---

**Happy Coding!** ☕💻