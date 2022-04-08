# Java Accelerator - Function Buildpacks for Knative (v1.0)

This accelerator generates template files, which enable developers to work with Function Buildpacks
and deploy a FaaS experience easily.

These template files are generated from VMware's open-source [Function Buildpacks for Knative](https://github.com/vmware-tanzu/function-buildpacks-for-knative) project. 

## Getting Started

To begin editing your function, refer to the tree diagram below of the file to modify:
```
functions-java
└── src/main/java/functions
    └── Hire.java // EDIT THIS FILE
    └── models/
```

Inside this file, you will find a main class and function that is invoked by default. Models contains scaffold classes you may edit or delete to build out your Java function. You can change the name of the default class and file, too.

To see samples of code deployable as a Function (FaaS) experience, visit the [samples folder](https://github.com/vmware-tanzu/function-buildpacks-for-knative/tree/main/samples/java).

### Implementation Details (FAQ)
To add/remove dependencies, you may use Maven or Gradle for dependency management as with any normal Java / Spring development.

Instead of arguments in the function definition, the `in` object has attributes that can be populated and accessed.

## Deploying
Please see [DEPLOYING.md](DEPLOYING.md) on how to build, deploy, and test your newly built function.

## Links

### Reporting Bugs or Vulnerabilities
* [Bugs, Issues, Missing Features](https://github.com/vmware-tanzu/function-buildpacks-for-knative/issues/)
* [Only Vulnerabilities](https://github.com/vmware-tanzu/function-buildpacks-for-knative/blob/main/SECURITY.md)
