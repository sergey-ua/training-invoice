# training-invoice
This is sample task. The goal is to calculate total amount for list of invoices considering refunds.

Let's say Invoice has these fields:

id - Invoice ID
amount - Invoice total
refunds - Invoices IDs and amounts which are canceled by this invoice

{id:1,amount:100.00,refunds:[]}
{id:2,amount:5.00,refunds:[]}
{id:3,amount:12.00,refunds:[{id:1, refunded_amount:50.00}, {id:2, refunded_amount:5.00}]}

+100.00
+5.00
+12.00
-50.00
-5.00
-----------
62.00


Project already contains classes for:
Invoice
Refund
InvoiceCalculator

Please implement InvoceCalculator so it work as described above.

You can test your solution with included unit test in InvoiceCalculatorTest

