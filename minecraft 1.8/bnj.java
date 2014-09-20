/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import java.util.List;
/*    3:     */ import java.util.Random;
/*    4:     */ 
/*    5:     */ public class bnj
/*    6:     */   extends bnn
/*    7:     */ {
/*    8:1467 */   private static final List a = Lists.newArrayList(new vl[] { new vl(amk.i, 0, 1, 3, 3), new vl(amk.j, 0, 1, 5, 10), new vl(amk.k, 0, 1, 3, 5), new vl(amk.P, 0, 1, 3, 15), new vl(amk.e, 0, 1, 3, 15), new vl(amk.b, 0, 1, 1, 5), new vl(amk.l, 0, 1, 1, 5), new vl(amk.Z, 0, 1, 1, 5), new vl(amk.Y, 0, 1, 1, 5), new vl(amk.aa, 0, 1, 1, 5), new vl(amk.ab, 0, 1, 1, 5), new vl(alq.a(aty.Z), 0, 3, 7, 5), new vl(alq.a(aty.g), 0, 3, 7, 5), new vl(amk.aA, 0, 1, 1, 3), new vl(amk.ck, 0, 1, 1, 1), new vl(amk.cl, 0, 1, 1, 1), new vl(amk.cm, 0, 1, 1, 1) });
/*    9:     */   private boolean b;
/*   10:     */   
/*   11:     */   public bnj() {}
/*   12:     */   
/*   13:     */   public bnj(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   14:     */   {
/*   15:1500 */     super(parambnk, paramInt);
/*   16:     */     
/*   17:1502 */     this.m = paramej;
/*   18:1503 */     this.l = parambjb;
/*   19:     */   }
/*   20:     */   
/*   21:     */   public static bnj a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   22:     */   {
/*   23:1507 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 10, 6, 7, paramej);
/*   24:1509 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   25:1510 */       return null;
/*   26:     */     }
/*   27:1513 */     return new bnj(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   28:     */   }
/*   29:     */   
/*   30:     */   protected void a(fn paramfn)
/*   31:     */   {
/*   32:1518 */     super.a(paramfn);
/*   33:1519 */     paramfn.a("Chest", this.b);
/*   34:     */   }
/*   35:     */   
/*   36:     */   protected void b(fn paramfn)
/*   37:     */   {
/*   38:1524 */     super.b(paramfn);
/*   39:1525 */     this.b = paramfn.n("Chest");
/*   40:     */   }
/*   41:     */   
/*   42:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   43:     */   {
/*   44:1530 */     if (this.h < 0)
/*   45:     */     {
/*   46:1531 */       this.h = b(paramaqu, parambjb);
/*   47:1532 */       if (this.h < 0) {
/*   48:1533 */         return true;
/*   49:     */       }
/*   50:1535 */       this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*   51:     */     }
/*   52:1539 */     a(paramaqu, parambjb, 0, 1, 0, 9, 4, 6, aty.a.P(), aty.a.P(), false);
/*   53:     */     
/*   54:     */ 
/*   55:1542 */     a(paramaqu, parambjb, 0, 0, 0, 9, 0, 6, aty.e.P(), aty.e.P(), false);
/*   56:     */     
/*   57:     */ 
/*   58:1545 */     a(paramaqu, parambjb, 0, 4, 0, 9, 4, 6, aty.e.P(), aty.e.P(), false);
/*   59:1546 */     a(paramaqu, parambjb, 0, 5, 0, 9, 5, 6, aty.U.P(), aty.U.P(), false);
/*   60:1547 */     a(paramaqu, parambjb, 1, 5, 1, 8, 5, 5, aty.a.P(), aty.a.P(), false);
/*   61:     */     
/*   62:     */ 
/*   63:1550 */     a(paramaqu, parambjb, 1, 1, 0, 2, 3, 0, aty.f.P(), aty.f.P(), false);
/*   64:1551 */     a(paramaqu, parambjb, 0, 1, 0, 0, 4, 0, aty.r.P(), aty.r.P(), false);
/*   65:1552 */     a(paramaqu, parambjb, 3, 1, 0, 3, 4, 0, aty.r.P(), aty.r.P(), false);
/*   66:1553 */     a(paramaqu, parambjb, 0, 1, 6, 0, 4, 6, aty.r.P(), aty.r.P(), false);
/*   67:1554 */     a(paramaqu, aty.f.P(), 3, 3, 1, parambjb);
/*   68:1555 */     a(paramaqu, parambjb, 3, 1, 2, 3, 3, 2, aty.f.P(), aty.f.P(), false);
/*   69:1556 */     a(paramaqu, parambjb, 4, 1, 3, 5, 3, 3, aty.f.P(), aty.f.P(), false);
/*   70:1557 */     a(paramaqu, parambjb, 0, 1, 1, 0, 3, 5, aty.f.P(), aty.f.P(), false);
/*   71:1558 */     a(paramaqu, parambjb, 1, 1, 6, 5, 3, 6, aty.f.P(), aty.f.P(), false);
/*   72:     */     
/*   73:     */ 
/*   74:1561 */     a(paramaqu, parambjb, 5, 1, 0, 5, 3, 0, aty.aO.P(), aty.aO.P(), false);
/*   75:1562 */     a(paramaqu, parambjb, 9, 1, 0, 9, 3, 0, aty.aO.P(), aty.aO.P(), false);
/*   76:     */     
/*   77:     */ 
/*   78:1565 */     a(paramaqu, parambjb, 6, 1, 4, 9, 4, 6, aty.e.P(), aty.e.P(), false);
/*   79:1566 */     a(paramaqu, aty.k.P(), 7, 1, 5, parambjb);
/*   80:1567 */     a(paramaqu, aty.k.P(), 8, 1, 5, parambjb);
/*   81:1568 */     a(paramaqu, aty.bi.P(), 9, 2, 5, parambjb);
/*   82:1569 */     a(paramaqu, aty.bi.P(), 9, 2, 4, parambjb);
/*   83:1570 */     a(paramaqu, parambjb, 7, 2, 4, 8, 2, 5, aty.a.P(), aty.a.P(), false);
/*   84:1571 */     a(paramaqu, aty.e.P(), 6, 1, 3, parambjb);
/*   85:1572 */     a(paramaqu, aty.al.P(), 6, 2, 3, parambjb);
/*   86:1573 */     a(paramaqu, aty.al.P(), 6, 3, 3, parambjb);
/*   87:1574 */     a(paramaqu, aty.T.P(), 8, 1, 1, parambjb);
/*   88:     */     
/*   89:     */ 
/*   90:1577 */     a(paramaqu, aty.bj.P(), 0, 2, 2, parambjb);
/*   91:1578 */     a(paramaqu, aty.bj.P(), 0, 2, 4, parambjb);
/*   92:1579 */     a(paramaqu, aty.bj.P(), 2, 2, 6, parambjb);
/*   93:1580 */     a(paramaqu, aty.bj.P(), 4, 2, 6, parambjb);
/*   94:     */     
/*   95:     */ 
/*   96:1583 */     a(paramaqu, aty.aO.P(), 2, 1, 4, parambjb);
/*   97:1584 */     a(paramaqu, aty.aB.P(), 2, 2, 4, parambjb);
/*   98:1585 */     a(paramaqu, aty.f.P(), 1, 1, 5, parambjb);
/*   99:1586 */     a(paramaqu, aty.ad.a(a(aty.ad, 3)), 2, 1, 5, parambjb);
/*  100:1587 */     a(paramaqu, aty.ad.a(a(aty.ad, 1)), 1, 1, 4, parambjb);
/*  101:1589 */     if ((!this.b) && 
/*  102:1590 */       (parambjb.b(new dt(a(5, 5), d(1), b(5, 5)))))
/*  103:     */     {
/*  104:1591 */       this.b = true;
/*  105:1592 */       a(paramaqu, parambjb, paramRandom, 5, 1, 5, a, 3 + paramRandom.nextInt(6));
/*  106:     */     }
/*  107:1597 */     for (int i = 6; i <= 8; i++) {
/*  108:1598 */       if ((a(paramaqu, i, 0, -1, parambjb).c().r() == bof.a) && (a(paramaqu, i, -1, -1, parambjb).c().r() != bof.a)) {
/*  109:1599 */         a(paramaqu, aty.aw.a(a(aty.aw, 3)), i, 0, -1, parambjb);
/*  110:     */       }
/*  111:     */     }
/*  112:1603 */     for (i = 0; i < 7; i++) {
/*  113:1604 */       for (int j = 0; j < 10; j++)
/*  114:     */       {
/*  115:1605 */         b(paramaqu, j, 6, i, parambjb);
/*  116:1606 */         b(paramaqu, aty.e.P(), j, -1, i, parambjb);
/*  117:     */       }
/*  118:     */     }
/*  119:1610 */     a(paramaqu, parambjb, 7, 1, 1, 1);
/*  120:     */     
/*  121:1612 */     return true;
/*  122:     */   }
/*  123:     */   
/*  124:     */   protected int c(int paramInt1, int paramInt2)
/*  125:     */   {
/*  126:1617 */     return 3;
/*  127:     */   }
/*  128:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bnj
 * JD-Core Version:    0.7.0.1
 */