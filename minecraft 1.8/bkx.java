/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bkx
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bkx() {}
/*    7:     */   
/*    8:     */   public bkx(ej paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1475 */     super(1, paramej, paramblf, 1, 2, 2);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1480 */     blf localblf1 = this.k.b[ej.c.a()];
/*   16:1481 */     blf localblf2 = this.k;
/*   17:1482 */     blf localblf3 = localblf1.b[ej.b.a()];
/*   18:1483 */     blf localblf4 = localblf2.b[ej.b.a()];
/*   19:1484 */     if (this.k.a / 25 > 0)
/*   20:     */     {
/*   21:1485 */       a(paramaqu, parambjb, 0, 8, localblf1.c[ej.a.a()]);
/*   22:1486 */       a(paramaqu, parambjb, 0, 0, localblf2.c[ej.a.a()]);
/*   23:     */     }
/*   24:1488 */     if (localblf4.b[ej.b.a()] == null) {
/*   25:1489 */       a(paramaqu, parambjb, 1, 8, 1, 6, 8, 7, a);
/*   26:     */     }
/*   27:1491 */     if (localblf3.b[ej.b.a()] == null) {
/*   28:1492 */       a(paramaqu, parambjb, 1, 8, 8, 6, 8, 14, a);
/*   29:     */     }
/*   30:     */     bec localbec;
/*   31:1496 */     for (int i = 1; i <= 7; i++)
/*   32:     */     {
/*   33:1497 */       localbec = b;
/*   34:1498 */       if ((i == 2) || (i == 6)) {
/*   35:1499 */         localbec = a;
/*   36:     */       }
/*   37:1501 */       a(paramaqu, parambjb, 0, i, 0, 0, i, 15, localbec, localbec, false);
/*   38:1502 */       a(paramaqu, parambjb, 7, i, 0, 7, i, 15, localbec, localbec, false);
/*   39:1503 */       a(paramaqu, parambjb, 1, i, 0, 6, i, 0, localbec, localbec, false);
/*   40:1504 */       a(paramaqu, parambjb, 1, i, 15, 6, i, 15, localbec, localbec, false);
/*   41:     */     }
/*   42:1508 */     for (i = 1; i <= 7; i++)
/*   43:     */     {
/*   44:1509 */       localbec = c;
/*   45:1510 */       if ((i == 2) || (i == 6)) {
/*   46:1511 */         localbec = e;
/*   47:     */       }
/*   48:1513 */       a(paramaqu, parambjb, 3, i, 7, 4, i, 8, localbec, localbec, false);
/*   49:     */     }
/*   50:1517 */     if (localblf2.c[ej.d.a()] != 0) {
/*   51:1518 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*   52:     */     }
/*   53:1520 */     if (localblf2.c[ej.f.a()] != 0) {
/*   54:1521 */       a(paramaqu, parambjb, 7, 1, 3, 7, 2, 4, f, f, false);
/*   55:     */     }
/*   56:1523 */     if (localblf2.c[ej.e.a()] != 0) {
/*   57:1524 */       a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, f, f, false);
/*   58:     */     }
/*   59:1526 */     if (localblf1.c[ej.c.a()] != 0) {
/*   60:1527 */       a(paramaqu, parambjb, 3, 1, 15, 4, 2, 15, f, f, false);
/*   61:     */     }
/*   62:1529 */     if (localblf1.c[ej.e.a()] != 0) {
/*   63:1530 */       a(paramaqu, parambjb, 0, 1, 11, 0, 2, 12, f, f, false);
/*   64:     */     }
/*   65:1532 */     if (localblf1.c[ej.f.a()] != 0) {
/*   66:1533 */       a(paramaqu, parambjb, 7, 1, 11, 7, 2, 12, f, f, false);
/*   67:     */     }
/*   68:1536 */     if (localblf4.c[ej.d.a()] != 0) {
/*   69:1537 */       a(paramaqu, parambjb, 3, 5, 0, 4, 6, 0, f, f, false);
/*   70:     */     }
/*   71:1539 */     if (localblf4.c[ej.f.a()] != 0)
/*   72:     */     {
/*   73:1540 */       a(paramaqu, parambjb, 7, 5, 3, 7, 6, 4, f, f, false);
/*   74:1541 */       a(paramaqu, parambjb, 5, 4, 2, 6, 4, 5, b, b, false);
/*   75:1542 */       a(paramaqu, parambjb, 6, 1, 2, 6, 3, 2, b, b, false);
/*   76:1543 */       a(paramaqu, parambjb, 6, 1, 5, 6, 3, 5, b, b, false);
/*   77:     */     }
/*   78:1545 */     if (localblf4.c[ej.e.a()] != 0)
/*   79:     */     {
/*   80:1546 */       a(paramaqu, parambjb, 0, 5, 3, 0, 6, 4, f, f, false);
/*   81:1547 */       a(paramaqu, parambjb, 1, 4, 2, 2, 4, 5, b, b, false);
/*   82:1548 */       a(paramaqu, parambjb, 1, 1, 2, 1, 3, 2, b, b, false);
/*   83:1549 */       a(paramaqu, parambjb, 1, 1, 5, 1, 3, 5, b, b, false);
/*   84:     */     }
/*   85:1551 */     if (localblf3.c[ej.c.a()] != 0) {
/*   86:1552 */       a(paramaqu, parambjb, 3, 5, 15, 4, 6, 15, f, f, false);
/*   87:     */     }
/*   88:1554 */     if (localblf3.c[ej.e.a()] != 0)
/*   89:     */     {
/*   90:1555 */       a(paramaqu, parambjb, 0, 5, 11, 0, 6, 12, f, f, false);
/*   91:1556 */       a(paramaqu, parambjb, 1, 4, 10, 2, 4, 13, b, b, false);
/*   92:1557 */       a(paramaqu, parambjb, 1, 1, 10, 1, 3, 10, b, b, false);
/*   93:1558 */       a(paramaqu, parambjb, 1, 1, 13, 1, 3, 13, b, b, false);
/*   94:     */     }
/*   95:1560 */     if (localblf3.c[ej.f.a()] != 0)
/*   96:     */     {
/*   97:1561 */       a(paramaqu, parambjb, 7, 5, 11, 7, 6, 12, f, f, false);
/*   98:1562 */       a(paramaqu, parambjb, 5, 4, 10, 6, 4, 13, b, b, false);
/*   99:1563 */       a(paramaqu, parambjb, 6, 1, 10, 6, 3, 10, b, b, false);
/*  100:1564 */       a(paramaqu, parambjb, 6, 1, 13, 6, 3, 13, b, b, false);
/*  101:     */     }
/*  102:1567 */     return true;
/*  103:     */   }
/*  104:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bkx
 * JD-Core Version:    0.7.0.1
 */