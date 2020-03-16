/**
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */

package com.truelines.i18n

/**
 * I18n management
 *
 * For the moment, it is done using simple maps but it should be modified in the future for at least reading
 * internationalized texts from files or using an external library doing that.
 */
object I18n {

    val unknownText = "unknown"

    val textMappingByLang = mutableMapOf<Lang,Map<String, String>>()

    init {
        textMappingByLang.put(Lang.ENGLISH, mapOf<String,String>(
                /**
                 * Global
                 */
                "global.error.unknown" to "Unkown error (code = '%s'). Please contact the support.",
                "global.error.server" to "Server error. Please contact the support.",

                /**
                 * AppBar
                 */
                "appbar.menu.tooltip" to "Menu",
                "appbar.about.tooltip" to "About",
                "appbar.notifications.tooltip" to "Notifications",
                "appbar.account.tooltip" to "Connected as '%s'",
                "appbar.account.info" to "Connected as",
                "appbar.account.tooltip.notconnected" to "Not Connected",
                "appbar.account.info.notconnected" to "Not Connected",
                "appbar.account.logout.button" to "Log out",
                "appbar.language.tooltip" to "Language",

                /**
                 * Universe
                 */
                "universe.title" to "Universes",
                "universe.description" to "Welcome to you universe",
                "universe.add.tooltip" to "Add a new universe",
                "universe.no.universe.text" to "No universe has been created yet",
                "universe.name.label" to "Name",
                "universe.description.label" to "Description",
                "universe.add.button" to "Add",
                "universe.cancel.button" to "Cancel",
                "universe.error.empty.name" to "The universe name is required",
                "universe.error.name.conflict" to "The universe '%s' already exists",
                "universe.error.invalid.name" to "The universe '%s' is invalid. The universe name should be an " +
                        "alpha-numerical name with optional spaces, dashes or underscores.",
                "universe.delete.tooltip" to "Delete the universe '%s'",
                "universe.delete.confirmation" to "Are you sure you want to delete the universe '%s'?",
                "universe.delete.button" to "Delete",
                "universe.update.button" to "Edit",
                "universe.update.tooltip" to "Edit the universe '%s'",

                /**
                 * Workspace
                 */
                "workspace.name.label" to "Name",
                "workspace.description.label" to "Description",
                "workspace.image.label" to "Image",
                "workspace.add.button" to "Add",
                "workspace.cancel.button" to "Cancel",
                "workspace.error.empty.name" to "The workspace name is required",
                "workspace.error.name.conflict" to "The workspace '%s' already exists",
                "workspace.error.invalid.name" to "The workspace '%s' is invalid. The workspace name should be an " +
                        "alpha-numerical name with optional spaces, dashes or underscores.",
                "workspace.edit.button" to "Edit",
                "workspace.edit.tooltip" to "Edit workspace '%s'",
                "workspace.delete.button" to "Delete",
                "workspace.delete.tooltip" to "Delete workspace '%s'",
                "workspace.add.card.title" to "New workspace",
                "workspace.add.card.description" to "Click on the card to add a new workspace",
                "workspace.card.open.tooltip" to "Click on the card to open the workspace '%s'",
                "workspace.delete.confirmation" to "Are you sure you want to delete the workspace '%s'?",
                "workspace.delete.button" to "Delete",

                /**
                 * Worksheet
                 */
                "worksheet.default.name" to "Worksheet",
                "worksheet.toolbar.filter.tooltip" to "Filter",
                "worksheet.toolbar.filter.label" to "Filter",
                "worksheet.toolbar.sort.tooltip" to "Sort",
                "worksheet.toolbar.sort.label" to "Sort",
                "worksheet.toolbar.groupby.tooltip" to "Group by",
                "worksheet.toolbar.groupby.label" to "Group by",
                "worksheet.toolbar.buildmode.label" to "Build Mode",
                "worksheet.toolbar.aggregationmode.label" to "Aggregate Rows",
                "worksheet.toolbar.roottable.label" to "Root Table",
                "worksheet.toolbar.roottable.notable.label" to "No root table",
                "worksheet.toolbar.columns.label" to "Columns",
                "worksheet.tab.menu.rename" to "Rename the worksheet",
                "worksheet.tab.menu.delete" to "Delete the worksheet",
                "worksheet.add.tooltip" to "Add a new worksheet",
                "worksheet.name.label" to "Name",
                "worksheet.add.button" to "Add",
                "worksheet.cancel.button" to "Cancel",
                "worksheet.delete.confirmation" to "Are you sure you want to delete the worksheet '%s'?",
                "worksheet.delete.button" to "Delete",
                "worksheet.rename.button" to "Rename",
                "worksheet.error.empty.name" to "The worksheet name is required",
                "worksheet.error.name.conflict" to "The worksheet '%s' already exists",
                "worksheet.error.invalid.name" to "The worksheet '%s' is invalid. The worksheet name should be an " +
                        "alpha-numerical name with optional spaces, dashes or underscores.",
                "worksheet.add.column.tooltip" to "Add a column",
                "worksheet.add.row.tooltip" to "Add a row",
                "worksheet.add.column.button" to "Add",
                "worksheet.add.column.search.placeholder" to "Search or create...",
                "worksheet.add.column.input.invalid" to "The path '%s' is invalid",
                "worksheet.entity.invalid.value" to "'%s' is not valid for type '%s'",
                "worksheet.column.remove.menu.item" to "Remove the column",
                "worksheet.add.column.action.create.attribute" to "Create the attribute '%s' on table '%s'",
                "worksheet.add.column.action.create.table.and.attribute" to "Create the table '%s' with the attribute" +
                        " '%s'",
                "worksheet.add.column.action.link.tables" to "Link the table '%s' to '%s'",
                "worksheet.add.column.action.create.attribute.and.link.tables" to "Create the attribute '%s' on table" +
                        " '%s' and link the table to '%s'",
                "worksheet.add.column.action.create.table.with.attribute.and.link.tables" to "Create the table '%s' " +
                        "with the attribute '%s' and link it to '%s'",
                "worksheet.column.attribute.name.conflict" to "The attribute '%s' already exists on table '%s'",
                "worksheet.add.column.action.default.table.name" to "Table1",


                "worksheet.column.attribute.panel.label" to "Attribute's properties",
                "worksheet.column.attribute.update.name" to "Name",
                "worksheet.column.attribute.update.type" to "Type",
                "worksheet.column.attribute.update.mandatory" to "Mandatory",
                "worksheet.column.attribute.update.editable" to "Editable",
                "worksheet.column.attribute.update.name.invalid" to "The attribute name '%s' is invalid",
                "worksheet.column.attribute.update.error.method.not.allowed" to "Impossible to modify an attribute " +
                        "already in use",
                "worksheet.column.attribute.update.error.unknown" to "The error '%s' occurred on server side",
                "worksheet.column.attribute.type.string" to "Text",
                "worksheet.column.attribute.type.integer" to "Number",
                "worksheet.column.attribute.type.float" to "Decimal",
                "worksheet.column.attribute.type.date" to "Date",
                "worksheet.column.attribute.type.boolean" to "Checkbox",

                "worksheet.column.aggregation.panel.label" to "Aggregation's properties",
                "worksheet.column.aggregation.method.label" to "Method",

                "bodycell.link.button.tooltip" to "Add a relation towards the table '%s'",
                "bodycell.add.relation.search.placeholder" to "Search or create...",
                "bodycell.add.relation.create.relation" to "Create a new line on table '%s' with attribute '%s' set " +
                        "to '%s'",
                "bodycell.add.relation.input.invalid" to "The value '%s' is not compatible with type '%s'",

                "worksheet.build.mode.display.label" to "Display Properties",
                "worksheet.build.mode.display.type.label" to "Type",
                "worksheet.build.mode.display.type.grid" to "Grid",
                "worksheet.build.mode.display.type.grid.column.label" to "Column",
                "worksheet.build.mode.display.type.grid.column.novalue" to "No value",
                "worksheet.build.mode.display.type.grid.columnvalue.label" to "Column value",
                "worksheet.build.mode.display.type.grid.columnvalue.novalue" to "No value",
                "worksheet.build.mode.display.type.piechart" to "Pie chart",
                "worksheet.build.mode.display.type.piechart.invalid.parameters" to "Parameters are not" +
                        "defined or invalid",
                "worksheet.build.mode.display.type.radarchart" to "Radar chart",
                "worksheet.build.mode.display.type.radarchart.invalid.parameters" to "Parameters are not" +
                        "defined or invalid",
                "worksheet.build.mode.display.type.dashboard" to "Dashboard",
                "worksheet.build.mode.parameters.label" to "Display Parameters",
                "worksheet.build.mode.display.type.piechart.labels.label" to "Labels",
                "worksheet.build.mode.display.type.piechart.values.label" to "Values",
                "worksheet.build.mode.display.type.radarchart.datasets.label" to "Group by",
                "worksheet.build.mode.display.type.radarchart.categories.label" to "Categories",
                "worksheet.build.mode.display.type.radarchart.datavalues.label" to "Values",
                "worksheet.build.mode.display.type.radarchart.filled.label" to "Filled",
                "worksheet.build.mode.display.type.barchart" to "Bar chart",
                "worksheet.build.mode.display.type.barchart.datasets.label" to "Group by",
                "worksheet.build.mode.display.type.barchart.categories.label" to "Categories",
                "worksheet.build.mode.display.type.barchart.datavalues.label" to "Values",
                "worksheet.build.mode.display.type.barchart.invalid.parameters" to "Parameters are not" +
                        "defined or invalid",
                "worksheet.build.mode.display.type.barchart.horizontal.label" to "Horizontal",
                "worksheet.build.mode.display.type.barchart.stacked.label" to "Stacked",
                "worksheet.build.mode.display.type.linechart" to "Line chart",
                "worksheet.build.mode.display.type.linechart.datasets.label" to "Group by",
                "worksheet.build.mode.display.type.linechart.categories.label" to "Categories",
                "worksheet.build.mode.display.type.linechart.datavalues.label" to "Values",
                "worksheet.build.mode.display.type.linechart.invalid.parameters" to "Parameters are not" +
                        "defined or invalid",
                "worksheet.build.mode.display.type.linechart.filled.label" to "Filled",
                "worksheet.build.mode.display.type.linechart.stacked.label" to "Stacked",
                "worksheet.build.mode.display.type.dashboard.worksheets.label" to "Worksheets",
                "worksheet.build.mode.display.type.dashboard.columnnb.label" to "Column number",
                "worksheet.build.mode.display.type.kpi" to "Indicator",
                "worksheet.build.mode.display.type.kpi.title.label" to "Label",
                "worksheet.build.mode.display.type.kpi.value.label" to "Value",
                "worksheet.build.mode.display.type.kpi.invalid.parameters" to "Parameters are not" +
                        "defined or invalid",

                "dashboard.add.worksheet.tooltip" to "Add a chart",
                "dashboard.search.chart.placeholder" to "Search for a chart",
                "dashboard.add.worksheet.invalid" to "The parameter '%s' is invalid. It " +
                        "should be an alpha-numerical name with optional spaces, dashes or underscores.",

                // Login
                "login.username.label" to "User name",
                "login.password.label" to "Password",
                "login.connect.button" to "Connect",
                "login.error.empty.username" to "Username must not be empty",
                "login.error.empty.password" to "Password must not be empty",
                "login.error.unauthorized" to "Invalid username or password"
        ))

        textMappingByLang.put(Lang.FRENCH, mapOf<String,String>(
                /**
                 * Global
                 */
                "global.error.unknown" to "Erreur inconnue (code = '%s'). Veuillez contacter le support s'il vous plaît.",
                "global.error.server" to "Erreur server. Veuillez contacter le support s'il vous plaît.",

                /**
                 * AppBar
                 */
                "appbar.menu.tooltip" to "Menu",
                "appbar.about.tooltip" to "A propos",
                "appbar.notifications.tooltip" to "Notifications",
                "appbar.account.tooltip" to "Connecté en tant que '%s'",
                "appbar.account.info" to "Connecté en tant que",
                "appbar.account.tooltip.notconnected" to "Non Connecté",
                "appbar.account.info.notconnected" to "Non Connecté",
                "appbar.account.logout.button" to "Déconnexion",
                "appbar.language.tooltip" to "Langue",

                /**
                 * Universe
                 */
                "universe.title" to "Univers",
                "universe.description" to "Bienvenue dans votre univers",
                "universe.add.tooltip" to "Ajouter un nouvel univers",
                "universe.no.universe.text" to "Aucun univers n'a été créé encore",
                "universe.name.label" to "Nom",
                "universe.description.label" to "Description",
                "universe.add.button" to "Ajouter",
                "universe.cancel.button" to "Annuler",
                "universe.error.empty.name" to "Le nom de l'univers est requis",
                "universe.error.name.conflict" to "L'univers '%s' existe déjà",
                "universe.error.invalid.name" to "Le nom '%s' est invalid. Le nom doit être alpha-numérique " +
                        "éventuellement séparé par des espaces, tirets ou tirets bas.",
                "universe.delete.tooltip" to "Supprimer l'univers '%s'",
                "universe.delete.confirmation" to "Etes-vous sûr de vouloir supprimer l'univers '%s' ?",
                "universe.delete.button" to "Supprimer",
                "universe.update.button" to "Modifier",
                "universe.update.tooltip" to "Modifier l'univers '%s'",

                /**
                 * Workspace
                 */
                "workspace.name.label" to "Nom",
                "workspace.description.label" to "Description",
                "workspace.image.label" to "Image",
                "workspace.add.button" to "Ajouter",
                "workspace.cancel.button" to "Annuler",
                "workspace.error.empty.name" to "Le nom de l'espace de travail est requis",
                "workspace.error.name.conflict" to "L'espace de travail '%s' existe déjà",
                "workspace.error.invalid.name" to "L'espace de travail '%s' n'est pas valide. Le nom de l'espace " +
                        "de travail doit être alpha-numérique éventuellement séparé par des espaces, " +
                        "tirets ou tirets bas.",
                "workspace.edit.button" to "Modifier",
                "workspace.edit.tooltip" to "Modifier l'espace de travail '%s'",
                "workspace.delete.button" to "Supprimer",
                "workspace.delete.tooltip" to "Supprimer l'espace de travail '%s'",
                "workspace.add.card.title" to "Nouvel espace de travail",
                "workspace.add.card.description" to "Cliquer sur la carte pour ajouter un nouvel espace de travail",
                "workspace.card.open.tooltip" to "Cliquer sur la carte pour ouvrir l'espace de travail '%s'",
                "workspace.delete.confirmation" to "Etes-vous sûr de vouloir supprimer l'espace de travail '%s' ?",
                "workspace.delete.button" to "Supprimer",

                /**
                 * Worksheet
                 */
                "worksheet.default.name" to "Feuille",
                "worksheet.toolbar.filter.label" to "Filtrer",
                "worksheet.toolbar.filter.tooltip" to "Filtrer",
                "worksheet.toolbar.sort.label" to "Trier",
                "worksheet.toolbar.sort.tooltip" to "Trier",
                "worksheet.toolbar.groupby.label" to "Grouper",
                "worksheet.toolbar.groupby.tooltip" to "Grouper",
                "worksheet.toolbar.buildmode.label" to "Mode Edition",
                "worksheet.toolbar.aggregationmode.label" to "Agréger les lignes",
                "worksheet.toolbar.roottable.label" to "Table Racine",
                "worksheet.toolbar.roottable.notable.label" to "Pas de table racine",
                "worksheet.toolbar.columns.label" to "Colonnes",
                "worksheet.tab.menu.rename" to "Renommer la feuille",
                "worksheet.tab.menu.delete" to "Supprimer la feuille",
                "worksheet.add.tooltip" to "Ajouter une nouvelle feuille",
                "worksheet.name.label" to "Nom",
                "worksheet.add.button" to "Ajouter",
                "worksheet.cancel.button" to "Annuler",
                "worksheet.delete.confirmation" to "Etes-vous sûr de vouloir supprimer la feuille '%s'?",
                "worksheet.delete.button" to "Supprimer",
                "worksheet.rename.button" to "Renommer",
                "worksheet.error.empty.name" to "Le nom de la feuille est requis",
                "worksheet.error.name.conflict" to "La feuille'%s' existe déjà",
                "worksheet.error.invalid.name" to "Le nom '%s' est invalid. Le nom doit être alpha-numérique " +
                        "éventuellement séparé par des espaces, tirets ou tirets bas.",
                "worksheet.add.column.tooltip" to "Ajouter une colonne",
                "worksheet.add.row.tooltip" to "Ajouter une ligne",
                "worksheet.add.column.button" to "Ajouter",
                "worksheet.add.column.search.placeholder" to "Chercher ou créer...",
                "worksheet.add.column.input.invalid" to "Le chemin '%s' n'est pas valide",
                "worksheet.entity.invalid.value" to "'%s' n'est pas valide pour le type '%s'",
                "worksheet.column.remove.menu.item" to "Supprimer la colonne",
                "worksheet.add.column.action.create.attribute" to "Créer l'attribut '%s' sur la table '%s'",
                "worksheet.add.column.action.create.table.and.attribute" to "Créer la table '%s' avec un attribut '%s'",
                "worksheet.add.column.action.link.tables" to "Lier la table '%s' à '%s'",
                "worksheet.add.column.action.create.attribute.and.link.tables" to "Créer l'attribut '%s' sur la table" +
                        " '%s' et lier la table à '%s'",
                "worksheet.add.column.action.create.table.with.attribute.and.link.tables" to "Créer la table '%s' " +
                        "avec un attribut '%s' et la lier à '%s'",
                "worksheet.column.attribute.name.conflict" to "L'attribute '%s' existe déjà dans la table '%s'",
                "worksheet.add.column.action.default.table.name" to "Table1",

                "worksheet.column.attribute.panel.label" to "Propriétés de l'attribut",
                "worksheet.column.attribute.update.name" to "Nom",
                "worksheet.column.attribute.update.type" to "Type",
                "worksheet.column.attribute.update.mandatory" to "Requis",
                "worksheet.column.attribute.update.editable" to "Editable",
                "worksheet.column.attribute.update.name.invalid" to "Le nom d'attribut '%s' n'est pas valide",
                "worksheet.column.attribute.update.error.method.not.allowed" to "Impossible de modifier un attribut " +
                        "déjà utilisé",
                "worksheet.column.attribute.update.error.unknown" to "L'erreur '%s' a été levée côté serveur",
                "worksheet.column.attribute.type.string" to "Texte",
                "worksheet.column.attribute.type.integer" to "Nombre",
                "worksheet.column.attribute.type.float" to "Décimal",
                "worksheet.column.attribute.type.date" to "Date",
                "worksheet.column.attribute.type.boolean" to "Checkbox",
                "worksheet.column.aggregation.panel.label" to "Propriétés de l'agregation",
                "worksheet.column.aggregation.method.label" to "Méthode",

                "bodycell.link.button.tooltip" to "Ajouter une relation vers la table '%s'",
                "bodycell.add.relation.search.placeholder" to "Chercher ou créer...",
                "bodycell.add.relation.create.relation" to "Créer une nouvelle ligne dans la table '%s' avec " +
                        "l'attribut '%s' valué à '%s'",
                "bodycell.add.relation.input.invalid" to "La valeur '%s' n'est pas compatible avec le type '%s'",

                "worksheet.build.mode.display.label" to "Propriété d'affichage",
                "worksheet.build.mode.display.type.label" to "Type",
                "worksheet.build.mode.display.type.grid" to "Grille",
                "worksheet.build.mode.display.type.grid.column.label" to "Colonne",
                "worksheet.build.mode.display.type.grid.column.novalue" to "Pas de valeur",
                "worksheet.build.mode.display.type.grid.columnvalue.label" to "Valeur",
                "worksheet.build.mode.display.type.grid.columnvalue.novalue" to "Pas de valeur",
                "worksheet.build.mode.display.type.piechart" to "Camembert",
                "worksheet.build.mode.display.type.piechart.invalid.parameters" to "Les paramètres ne sont pas " +
                        "définis ou ne sont pas valides",
                "worksheet.build.mode.display.type.radarchart" to "Radar",
                "worksheet.build.mode.display.type.radarchart.invalid.parameters" to "Les paramètres ne sont pas " +
                        "définis ou ne sont pas valides",
                "worksheet.build.mode.display.type.dashboard" to "Dashboard",
                "worksheet.build.mode.parameters.label" to "Paramètres d'affichage",
                "worksheet.build.mode.display.type.piechart.labels.label" to "Labels",
                "worksheet.build.mode.display.type.piechart.values.label" to "Valeurs",
                "worksheet.build.mode.display.type.radarchart.datasets.label" to "Grouper par",
                "worksheet.build.mode.display.type.radarchart.categories.label" to "Catégories",
                "worksheet.build.mode.display.type.radarchart.datavalues.label" to "Valeurs",
                "worksheet.build.mode.display.type.radarchart.filled.label" to "Rempli",
                "worksheet.build.mode.display.type.barchart" to "Bar chart",
                "worksheet.build.mode.display.type.barchart.datasets.label" to "Grouper par",
                "worksheet.build.mode.display.type.barchart.categories.label" to "Catégories",
                "worksheet.build.mode.display.type.barchart.datavalues.label" to "Valeurs",
                "worksheet.build.mode.display.type.barchart.invalid.parameters" to "Les paramètres ne sont pas " +
                        "définis ou ne sont pas valides",
                "worksheet.build.mode.display.type.barchart.horizontal.label" to "Horizontal",
                "worksheet.build.mode.display.type.barchart.stacked.label" to "Empilé",
                "worksheet.build.mode.display.type.linechart" to "Line chart",
                "worksheet.build.mode.display.type.linechart.datasets.label" to "Grouper par",
                "worksheet.build.mode.display.type.linechart.categories.label" to "Catégories",
                "worksheet.build.mode.display.type.linechart.datavalues.label" to "Valeurs",
                "worksheet.build.mode.display.type.linechart.invalid.parameters" to "Les paramètres ne sont pas " +
                        "définis ou ne sont pas valides",
                "worksheet.build.mode.display.type.linechart.filled.label" to "Rempli",
                "worksheet.build.mode.display.type.linechart.stacked.label" to "Empilé",
                "worksheet.build.mode.display.type.dashboard.worksheets.label" to "Feuilles",
                "worksheet.build.mode.display.type.dashboard.columnnb.label" to "Nb colonnes",
                "worksheet.build.mode.display.type.kpi" to "Indicateur",
                "worksheet.build.mode.display.type.kpi.invalid.parameters" to "Les paramètres ne sont pas " +
                        "définis ou ne sont pas valides",
                "worksheet.build.mode.display.type.kpi.title.label" to "Label",
                "worksheet.build.mode.display.type.kpi.value.label" to "Valeur",

                "dashboard.add.worksheet.tooltip" to "Ajouter un graphe",
                "dashboard.search.chart.placeholder" to "Chercher un graphe",
                "dashboard.add.worksheet.invalid" to "Le paramètre '%s' n'est pas valide. Il doit être composé " +
                        "de caractères alpha-numériques, de points, de tirets ou d'underscores.",

                // Login
                "login.username.label" to "Nom",
                "login.password.label" to "Mot de passe",
                "login.connect.button" to "Se Connecter",
                "login.error.empty.username" to "Le nom ne peut être vide",
                "login.error.empty.password" to "Le mot de passe ne peut être vide",
                "login.error.unauthorized" to "Nom ou mot de passe non valide"
        ))
    }

    fun getText(lang: Lang, key: String, vararg args: String): String {
        var i18nText = textMappingByLang.get(lang)?.get(key)
        if (i18nText == null) {
            return unknownText
        }
        return i18nText.format(*args)
    }

    fun String.format(vararg args: String): String {
        var result = this
        if (args != null && args.isNotEmpty()) {
            args.forEach {
                result = result.replaceFirst("%s", it)
            }
        }
        return result
    }
}