/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bmb
/*    5:     */   extends bmk
/*    6:     */ {
/*    7:     */   private boolean a;
/*    8:     */   
/*    9:     */   public bmb() {}
/*   10:     */   
/*   11:     */   public bmb(int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   12:     */   {
/*   13:1460 */     super(paramInt);
/*   14:     */     
/*   15:1462 */     this.m = paramej;
/*   16:1463 */     this.l = parambjb;
/*   17:     */   }
/*   18:     */   
/*   19:     */   protected void a(fn paramfn)
/*   20:     */   {
/*   21:1468 */     super.a(paramfn);
/*   22:1469 */     paramfn.a("Mob", this.a);
/*   23:     */   }
/*   24:     */   
/*   25:     */   protected void b(fn paramfn)
/*   26:     */   {
/*   27:1474 */     super.b(paramfn);
/*   28:1475 */     this.a = paramfn.n("Mob");
/*   29:     */   }
/*   30:     */   
/*   31:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   32:     */   {
/*   33:1480 */     if (parambms != null) {
/*   34:1481 */       ((bmh)parambms).b = this;
/*   35:     */     }
/*   36:     */   }
/*   37:     */   
/*   38:     */   public static bmb a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   39:     */   {
/*   40:1486 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -1, 0, 11, 8, 16, paramej);
/*   41:1488 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   42:1489 */       return null;
/*   43:     */     }
/*   44:1492 */     return new bmb(paramInt4, paramRandom, localbjb, paramej);
/*   45:     */   }
/*   46:     */   
/*   47:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   48:     */   {
/*   49:1498 */     a(paramaqu, parambjb, 0, 0, 0, 10, 7, 15, false, paramRandom, blr.c());
/*   50:     */     
/*   51:1500 */     a(paramaqu, paramRandom, parambjb, bml.c, 4, 1, 0);
/*   52:     */     
/*   53:     */ 
/*   54:1503 */     int i = 6;
/*   55:1504 */     a(paramaqu, parambjb, 1, i, 1, 1, i, 14, false, paramRandom, blr.c());
/*   56:1505 */     a(paramaqu, parambjb, 9, i, 1, 9, i, 14, false, paramRandom, blr.c());
/*   57:1506 */     a(paramaqu, parambjb, 2, i, 1, 8, i, 2, false, paramRandom, blr.c());
/*   58:1507 */     a(paramaqu, parambjb, 2, i, 14, 8, i, 14, false, paramRandom, blr.c());
/*   59:     */     
/*   60:     */ 
/*   61:1510 */     a(paramaqu, parambjb, 1, 1, 1, 2, 1, 4, false, paramRandom, blr.c());
/*   62:1511 */     a(paramaqu, parambjb, 8, 1, 1, 9, 1, 4, false, paramRandom, blr.c());
/*   63:1512 */     a(paramaqu, parambjb, 1, 1, 1, 1, 1, 3, aty.k.P(), aty.k.P(), false);
/*   64:1513 */     a(paramaqu, parambjb, 9, 1, 1, 9, 1, 3, aty.k.P(), aty.k.P(), false);
/*   65:     */     
/*   66:     */ 
/*   67:1516 */     a(paramaqu, parambjb, 3, 1, 8, 7, 1, 12, false, paramRandom, blr.c());
/*   68:1517 */     a(paramaqu, parambjb, 4, 1, 9, 6, 1, 11, aty.k.P(), aty.k.P(), false);
/*   69:1520 */     for (int j = 3; j < 14; j += 2)
/*   70:     */     {
/*   71:1521 */       a(paramaqu, parambjb, 0, 3, j, 0, 4, j, aty.bi.P(), aty.bi.P(), false);
/*   72:1522 */       a(paramaqu, parambjb, 10, 3, j, 10, 4, j, aty.bi.P(), aty.bi.P(), false);
/*   73:     */     }
/*   74:1524 */     for (j = 2; j < 9; j += 2) {
/*   75:1525 */       a(paramaqu, parambjb, j, 3, 15, j, 4, 15, aty.bi.P(), aty.bi.P(), false);
/*   76:     */     }
/*   77:1529 */     j = a(aty.bv, 3);
/*   78:1530 */     a(paramaqu, parambjb, 4, 1, 5, 6, 1, 7, false, paramRandom, blr.c());
/*   79:1531 */     a(paramaqu, parambjb, 4, 2, 6, 6, 2, 7, false, paramRandom, blr.c());
/*   80:1532 */     a(paramaqu, parambjb, 4, 3, 7, 6, 3, 7, false, paramRandom, blr.c());
/*   81:1533 */     for (int k = 4; k <= 6; k++)
/*   82:     */     {
/*   83:1534 */       a(paramaqu, aty.bv.a(j), k, 1, 4, parambjb);
/*   84:1535 */       a(paramaqu, aty.bv.a(j), k, 2, 5, parambjb);
/*   85:1536 */       a(paramaqu, aty.bv.a(j), k, 3, 6, parambjb);
/*   86:     */     }
/*   87:1539 */     k = ej.c.b();
/*   88:1540 */     int m = ej.d.b();
/*   89:1541 */     int n = ej.f.b();
/*   90:1542 */     int i1 = ej.e.b();
/*   91:1544 */     if (this.m != null) {
/*   92:1545 */       switch (blu.b[this.m.ordinal()])
/*   93:     */       {
/*   94:     */       case 2: 
/*   95:1547 */         k = ej.d.b();
/*   96:1548 */         m = ej.c.b();
/*   97:1549 */         break;
/*   98:     */       case 4: 
/*   99:1551 */         k = ej.f.b();
/*  100:1552 */         m = ej.e.b();
/*  101:1553 */         n = ej.d.b();
/*  102:1554 */         i1 = ej.c.b();
/*  103:1555 */         break;
/*  104:     */       case 3: 
/*  105:1557 */         k = ej.e.b();
/*  106:1558 */         m = ej.f.b();
/*  107:1559 */         n = ej.d.b();
/*  108:1560 */         i1 = ej.c.b();
/*  109:     */       }
/*  110:     */     }
/*  111:1565 */     a(paramaqu, aty.bG.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 4, 3, 8, parambjb);
/*  112:1566 */     a(paramaqu, aty.bG.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 5, 3, 8, parambjb);
/*  113:1567 */     a(paramaqu, aty.bG.a(k).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 6, 3, 8, parambjb);
/*  114:1568 */     a(paramaqu, aty.bG.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 4, 3, 12, parambjb);
/*  115:1569 */     a(paramaqu, aty.bG.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 5, 3, 12, parambjb);
/*  116:1570 */     a(paramaqu, aty.bG.a(m).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 6, 3, 12, parambjb);
/*  117:1571 */     a(paramaqu, aty.bG.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 9, parambjb);
/*  118:1572 */     a(paramaqu, aty.bG.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 10, parambjb);
/*  119:1573 */     a(paramaqu, aty.bG.a(n).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 3, 3, 11, parambjb);
/*  120:1574 */     a(paramaqu, aty.bG.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 9, parambjb);
/*  121:1575 */     a(paramaqu, aty.bG.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 10, parambjb);
/*  122:1576 */     a(paramaqu, aty.bG.a(i1).a(avq.b, Boolean.valueOf(paramRandom.nextFloat() > 0.9F)), 7, 3, 11, parambjb);
/*  123:1578 */     if (!this.a)
/*  124:     */     {
/*  125:1579 */       i = d(3);
/*  126:1580 */       dt localdt = new dt(a(5, 6), i, b(5, 6));
/*  127:1581 */       if (parambjb.b(localdt))
/*  128:     */       {
/*  129:1582 */         this.a = true;
/*  130:1583 */         paramaqu.a(localdt, aty.ac.P(), 2);
/*  131:     */         
/*  132:1585 */         bcm localbcm = paramaqu.s(localdt);
/*  133:1586 */         if ((localbcm instanceof bdg)) {
/*  134:1587 */           ((bdg)localbcm).b().a("Silverfish");
/*  135:     */         }
/*  136:     */       }
/*  137:     */     }
/*  138:1592 */     return true;
/*  139:     */   }
/*  140:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bmb
 * JD-Core Version:    0.7.0.1
 */