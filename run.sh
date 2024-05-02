#!/bin/bash
javadoc -docletpath target/ElementProduct-1.0.0-jar-with-dependencies.jar -doclet BookWise.Solution.ElementProduct.Doclet "$@"
